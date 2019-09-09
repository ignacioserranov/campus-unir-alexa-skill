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

import es.ignacio.serranov.campusUnir.entity.CalendarCollection;
import es.ignacio.serranov.campusUnir.service.SakaiService;

public class CalendarIntentHandler implements RequestHandler {

	private static String sakaiSessionId = "";
	
	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.intentName("CalendarIntent"));
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
        //Call CALENDAR Sakai Service
        String calendar = "";
        List<CalendarCollection> calendarEvents = SakaiService.getCalendarEvents(sakaiSessionId);
        if(calendarEvents != null && !calendarEvents.isEmpty()){
        	calendar = toStringCalendarEvents(calendarEvents);
        }
        if(calendar == null || calendar.isEmpty()) {
			calendar = "No existen eventos en el Calendario.";
		}
        String repromptText = "Consulta los eventos del calendario en Campus UNIR.";

        return input.getResponseBuilder()
				.withSpeech(calendar)
				.withSimpleCard(CARD_TITLE, calendar)
				.withReprompt(repromptText)
				.build();
	}
	
	public static String toStringCalendarEvents(List<CalendarCollection> calendarEvents){
		String calendar = "";
		if (calendarEvents != null && !calendarEvents.isEmpty()) {
			calendar = "Existen " + calendarEvents.size() + " eventos en el calendario para los próximos 7 días. ";
			int i = 1;
			StringBuffer result = new StringBuffer();
			for (CalendarCollection calendarEvent : calendarEvents) {
				String tituloEvento = calendarEvent.getTitle();
				result.append("\n Evento ").append(i++).append(" : ").append(tituloEvento);
				if (!tituloEvento.substring(tituloEvento.length() - 1).contains(".")) {
					result.append(". ");
				}
			}
			if (result != null && result.length() != 0) {
				calendar += result.toString();
			}
		}
		System.out.println("[DEBUG] toStringCalendarEvents: "+calendar);
		return calendar;
	}
}
