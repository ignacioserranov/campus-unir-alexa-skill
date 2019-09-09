package es.ignacio.serranov.campusUnir;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import es.ignacio.serranov.campusUnir.entity.AssignmentCollection;
import es.ignacio.serranov.campusUnir.entity.CalendarCollection;
import es.ignacio.serranov.campusUnir.entity.Props;
import es.ignacio.serranov.campusUnir.entity.Site;
import es.ignacio.serranov.campusUnir.entity.SiteCollection;
import es.ignacio.serranov.campusUnir.service.SakaiService;

public class Test {

	private static String sessionId = "";
	private static ClientConfig config = new DefaultClientConfig();
	private static Client client = Client.create(config);

	public static void main(String[] args) {
		try {
			//PRUEBA 1
			//login(Constants.sakaiUserName, Constants.sakaiPassword);
			//String asignaturas = getSubjects();
			//PRUEBA 2
			//config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			if(sessionId.isEmpty()){
				sessionId = SakaiService.login(Constants.sakaiUserName, Constants.sakaiPassword);
			}
			String asignaturas = SakaiService.getSubjects(sessionId);
			System.out.println("Resultado ASIGNATURAS: "+asignaturas);
			List<AssignmentCollection> assignments = SakaiService.getAssignments(sessionId);
			String assignment = AssignmentIntentHandler.toStringAssignmentList(assignments);
			System.out.println("Resultado TAREAS PENDIENTES: " + assignment);
			List<CalendarCollection> calendarEvents = SakaiService.getCalendarEvents(sessionId);
			String calendar = CalendarIntentHandler.toStringCalendarEvents(calendarEvents);
			System.out.println("Resultado CALENDARIO: " + calendar);
			String announcements = SakaiService.getAnnouncements(sessionId);
			System.out.println("Resultado NOVEDADES: " + announcements);
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
	}

//	public static void login(String user, String password) {
//		WebResource service = client.resource(Constants.sessionServiceURL);
//		// Prepara los parámetros que se van a mandar con la petición a SAKAI
//		MultivaluedMap<String, String> loginData = new MultivaluedMapImpl();
//		loginData.add("_username", user);
//		loginData.add("_password", password);
//		ClientResponse response = service.post(ClientResponse.class, loginData);
//		if (response.getStatus() == 201) {
//			sessionId = response.getEntity(String.class);
//			System.out.println("Login success: " + sessionId);
//		}
//	}
//
//	public static String getSubjects() {
//		String result = "";
//		if (sessionId.isEmpty()) {
//			login(Constants.sakaiUserName, Constants.sakaiPassword);
//		}
//		WebResource service = client.resource(Constants.siteServiceURL + "?sakai.session=" + sessionId);
//		ClientResponse response2 = service.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
//		if (response2.getStatus() == 200) {
//			Site unir = (Site) response2.getEntity(Site.class);
//			if (unir != null) {
//				List<SiteCollection> sites = unir.getSiteCollection();
//				if (sites != null) {
//					for (SiteCollection site : sites) {
//						System.out.println("[DEBUG] Asignatura 1: " + site.getEntityTitle());
//						Props siteProps = site.getProps();
//						if (siteProps != null) {
//							String subject = siteProps.getUnirSubject();
//							System.out.println("[DEBUG] Asignatura 2: " + subject);
//							if (subject != null) {
//								if (!result.isEmpty()) {
//									result += ", ";
//								}
//								result += siteProps.getUnirSubject();
//							}
//						}
//					}
//				}
//			}
//		}
//		return result;
//	}
}
