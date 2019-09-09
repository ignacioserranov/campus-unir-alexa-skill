package es.ignacio.serranov.campusUnir;

import java.util.Map;
import java.util.Optional;

import static es.ignacio.serranov.campusUnir.CampusUnirStreamHandler.CARD_TITLE;

import com.amazon.ask.attributes.AttributesManager;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import es.ignacio.serranov.campusUnir.service.SakaiService;

public class SubjectIntentHandler implements RequestHandler {
	
	private static String sakaiSessionId = "";

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.intentName("SubjectIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		// Get any existing attributes from the incoming request session
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
        
        //Call SUBJECT Sakai Service
        String subjects = SakaiService.getSubjects(sakaiSessionId);
        String subjectsText = "Estas son tus asignaturas disponibles en Campus UNIR: ";
        String repromptText = "Consulta las asignaturas disponibles en Campus UNIR.";
        if(subjects!=null && !subjects.isEmpty()){
        	subjectsText+= subjects;
        } else {
        	subjectsText = "No existen asignaturas disponibles actualmente.";
        	System.out.println("[DEBUG] Empty Subjects.");
        }
        
		return input.getResponseBuilder()
				.withSpeech(subjectsText)
				.withSimpleCard(CARD_TITLE, subjectsText)
				.withReprompt(repromptText)
				.build();
	}
}
