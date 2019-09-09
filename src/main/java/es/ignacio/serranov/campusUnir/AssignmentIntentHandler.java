package es.ignacio.serranov.campusUnir;

import static es.ignacio.serranov.campusUnir.CampusUnirStreamHandler.CARD_TITLE;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.amazon.ask.attributes.AttributesManager;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import es.ignacio.serranov.campusUnir.entity.AssignmentCollection;
import es.ignacio.serranov.campusUnir.service.SakaiService;

public class AssignmentIntentHandler implements RequestHandler {

	private static String sakaiSessionId = "";
	
	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.intentName("AssignmentIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		// Get any existing attributes from the incoming request
		AttributesManager attributesManager = input.getAttributesManager();
        Map <String,Object> attributes = attributesManager.getSessionAttributes();
        
        if (attributes.containsKey("sakai.session")){
        	System.out.println("[DEBUG] sakai.session Present in attributes, recovering...");
        	sakaiSessionId = attributes.get("sakai.session").toString(); 
        	System.out.println("[DEBUG] recovered sakai.session: "+sakaiSessionId);
        }
        if(sakaiSessionId.isEmpty()){
        	System.out.println("[DEBUG] sakai.session empty, first logging...");
        	//Call LOGIN Sakai Service to create a new session
        	sakaiSessionId = SakaiService.login(Constants.sakaiUserName, Constants.sakaiPassword);
        	if(sakaiSessionId!=null && !sakaiSessionId.isEmpty()){
        		attributes.put("sakai.session", sakaiSessionId);
                // This saves the attributes to the current session, so the value is available to the next intent.
                attributesManager.setSessionAttributes(attributes);
        	}
        }
  
        //Call ASSIGNMENT Sakai Service
        String assignmentText = "";
        List<AssignmentCollection> assignmentList = SakaiService.getAssignments(sakaiSessionId);
        if(assignmentList != null && !assignmentList.isEmpty()){
            assignmentText = toStringAssignmentList(assignmentList);        	
        }
        if(assignmentText == null || assignmentText.isEmpty()){
        	assignmentText = "No existen tareas pendientes.";
        }
        String repromptText = "Consulta tus tareas pendientes en Campus UNIR.";
        
		return input.getResponseBuilder()
				.withSpeech(assignmentText)
				.withSimpleCard(CARD_TITLE, assignmentText)
				.withReprompt(repromptText)
				.build();
	}
	
	public static String toStringAssignmentList(List<AssignmentCollection> assignments){
		String assignmentResult = "";
		if(assignments != null && !assignments.isEmpty()){
			if(assignments.size()==1){
				assignmentResult+= "Existe " + assignments.size() + " tarea pendiente. ";
			} else {
				assignmentResult+= "Existen " + assignments.size() + " tareas pendientes. ";
			}
        	int i = 1;
        	StringBuffer result = new StringBuffer();
        	for (AssignmentCollection assignment : assignments) {
				if(assignment.getStatus().compareTo("Abierto") == 0 ){
					result.append("\n Tarea pendiente ").append(i++).append(" : ").append(assignment.getTitle());
				}
        	}
        	if (result != null && result.length() != 0) {
        		assignmentResult+=result.toString();
        	}
        }
		System.out.println("[DEBUG] toStringAssignmentList: "+assignmentResult);
		return assignmentResult;
	}
}
