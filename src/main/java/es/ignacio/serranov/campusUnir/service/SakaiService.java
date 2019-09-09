package es.ignacio.serranov.campusUnir.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.jsoup.Jsoup;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import es.ignacio.serranov.campusUnir.Constants;
import es.ignacio.serranov.campusUnir.entity.Announcement;
import es.ignacio.serranov.campusUnir.entity.AnnouncementCollection;
import es.ignacio.serranov.campusUnir.entity.Assignment;
import es.ignacio.serranov.campusUnir.entity.AssignmentCollection;
import es.ignacio.serranov.campusUnir.entity.Calendar;
import es.ignacio.serranov.campusUnir.entity.CalendarCollection;
import es.ignacio.serranov.campusUnir.entity.Props;
import es.ignacio.serranov.campusUnir.entity.Site;
import es.ignacio.serranov.campusUnir.entity.SiteCollection;

public class SakaiService {
	
	private static String sessionId = "";
	private static ClientConfig config = new DefaultClientConfig();
	private static Client client = Client.create(config);
	private static WebResource serviceLogin;
	private static WebResource serviceSite;
	private static WebResource serviceAnnouncement;
	private static WebResource serviceCalendar;
	private static WebResource serviceAssignment;

	
	public static String login(String user, String password) {
		serviceLogin = client.resource(Constants.sessionServiceURL);
		// Prepara los parámetros que se van a mandar con la petición a SAKAI
		MultivaluedMap<String, String> loginData = new MultivaluedMapImpl();
		loginData.add("_username", user);
		loginData.add("_password", password);
		// POST al servicio SAKAI de login
		ClientResponse responseLogin = serviceLogin.post(ClientResponse.class, loginData);
		System.out.println("[DEBUG] LOGIN service...");
		if (responseLogin.getStatus() == 201) {
			sessionId = responseLogin.getEntity(String.class);
			System.out.println("[INFO] Login success: " + sessionId);
		}
		return sessionId;
	}
	
	public static String getSubjects(String sessionId) {
		String subjectsResult = "";
		if (!sessionId.isEmpty()) {
			config.getClasses().add(JacksonJaxbJsonProvider.class);
			serviceSite = client.resource(Constants.siteServiceURL + "?sakai.session=" + sessionId);
			// GET al servicio SAKAI de Site (obtener las asignaturas)
			ClientResponse responseSite = serviceSite.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			System.out.println("[DEBUG] SUBJECT service...");
			if (responseSite.getStatus() == 200) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				Site unirSites=null;
				try {
					unirSites = objectMapper.readValue(responseSite.getEntity(String.class), Site.class);
				} catch (ClientHandlerException | UniformInterfaceException | IOException e) {
					System.out.println("[ERROR] Exception parsing Subject JSON: "+e);
				}
				if (unirSites != null) {
					// Obtener listado de asignaturas (sites)
					List<SiteCollection> sites = unirSites.getsite_collection();
					if (sites != null) {
						for (SiteCollection site : sites) {
							Props siteProps = site.getProps();
							if (siteProps != null) {
								String subject = siteProps.getUnirSubject();
								if (subject != null) {
									if (!subjectsResult.isEmpty()) {
										subjectsResult += ", ";
									}
									subjectsResult += subject;
								}
							}
						}
						System.out.println("[DEBUG] Subjects: "+subjectsResult);
					}
				}
			}
		}
		return subjectsResult;
	}
	
	public static String getAnnouncements(String sessionId) {
		String announcementsResult = "";
		if (!sessionId.isEmpty()) {
			config.getClasses().add(JacksonJaxbJsonProvider.class);
			serviceAnnouncement = client.resource(Constants.announcementServiceURL + "?sakai.session=" + sessionId);
			// GET al servicio SAKAI de Announcements (obtener las novedades)
			ClientResponse responseAnnouncement = serviceAnnouncement.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			System.out.println("[DEBUG] ANNOUNCEMENT service...");
			if (responseAnnouncement.getStatus() == 200) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				Announcement unirAnnouncements = null;
				try {
					unirAnnouncements = objectMapper.readValue(responseAnnouncement.getEntity(String.class),Announcement.class);
				} catch (ClientHandlerException | UniformInterfaceException | IOException e) {
					System.out.println("[ERROR] Exception parsing Announcement JSON: " + e);
				}
				if (unirAnnouncements != null) {
					// Obtener listado de novedades (Announcements)
					List<AnnouncementCollection> announcementList = unirAnnouncements.getAnnouncementCollection();
					StringBuffer result = new StringBuffer();
					if (announcementList != null) {
						int i = 1;
						for (AnnouncementCollection announcement : announcementList) {
							String title = announcement.getTitle();
							String body = announcement.getBody();
							if (title != null && body != null) {
								body = html2text(body);
								result.append("\n Novedad ").append(i++).append(": ").append(title).append(body);
								if (!body.substring(body.length() - 1).contains(".")) {
									result.append(". ");
								}
							}
						}
						announcementsResult = result.toString();
						System.out.println("[DEBUG] Announcements: " + announcementsResult);
					}
				}
			}
		}
		return announcementsResult;
	}
	
	public static List<CalendarCollection> getCalendarEvents(String sessionId) {
		List<CalendarCollection> calendarEventsList = null;
		if (!sessionId.isEmpty()) {
			config.getClasses().add(JacksonJaxbJsonProvider.class);
			String calendarEventsParameters = "?sakai.session=" + sessionId + "&" + getEventsCalendarParams();
			System.out.println("[INFO] calendarEvents service URL: "+calendarEventsParameters);
			serviceCalendar = client.resource(Constants.calendarServiceURL + calendarEventsParameters);
			// GET al servicio SAKAI de Announcements (obtener las novedades)
			ClientResponse responseCalendar = serviceCalendar.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			System.out.println("[DEBUG] CALENDAR service...");
			if (responseCalendar.getStatus() == 200) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				Calendar unirCalendar = null;
				try {
					unirCalendar = objectMapper.readValue(responseCalendar.getEntity(String.class),Calendar.class);
				} catch (ClientHandlerException | UniformInterfaceException | IOException e) {
					System.out.println("[ERROR] Exception parsing Announcement JSON: " + e);
				}
				if (unirCalendar != null) {
					// Obtener listado de eventos del Calendario
					calendarEventsList = unirCalendar.getCalendarCollection();
					if (calendarEventsList != null) {
						System.out.println("[DEBUG] Eventos del Calendario: " + calendarEventsList.size());
					}
				}
			}
		}
		return calendarEventsList;
	}
	
	public static String toStringCalendarEvents(List<CalendarCollection> calendarEvents){
		String calendar = "";
		if(calendarEvents != null && !calendarEvents.isEmpty()){
        	calendar+= "Existen " + calendarEvents.size() + " eventos en el calendario para los próximos 7 días. ";
        	int i = 1;
        	StringBuffer result = new StringBuffer();
        	for(CalendarCollection calendarEvent:calendarEvents){
        		result.append("\n Evento ").append(i++).append(" : ").append(calendarEvent.getTitle());
        	}
        	calendar+=result.toString();
        } else {
        	calendar = "No existen eventos en el Calendario.";
        }
		return calendar;
	}
	
	public static String getEventsCalendarParams(){
		StringBuffer parameters = new StringBuffer();
		LocalDateTime startDate = LocalDateTime.now();
		LocalDateTime endDate = startDate.plus(1, ChronoUnit.WEEKS);
		DateTimeFormatter formmat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String fechaInicio = formmat.format(startDate);
		String fechaFin = formmat.format(endDate);
		parameters.append(Constants.calendarFirstDateParam).append("=").append(fechaInicio).append("&").append(Constants.calendarLastDateParam).append("=").append(fechaFin);
		return parameters.toString();
	}
	
	public static String html2text(String html) {
	    return Jsoup.parse(html).text();
	}

	public static List<AssignmentCollection> getAssignments(String sakaiSessionId) {
		List<AssignmentCollection> assignmentResult = new ArrayList<AssignmentCollection>();
		if (!sessionId.isEmpty()) {
			config.getClasses().add(JacksonJaxbJsonProvider.class);
			serviceAssignment = client.resource(Constants.assignmentServiceURL + "?sakai.session=" + sessionId);
			// GET al servicio SAKAI de Assignments (obtener las tareas pendientes)
			ClientResponse responseAssignment = serviceAssignment.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			System.out.println("[DEBUG] ASSIGNMENT service...");
			if (responseAssignment.getStatus() == 200) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				Assignment unirAssignments = null;
				try {
					unirAssignments = objectMapper.readValue(responseAssignment.getEntity(String.class),Assignment.class);
				} catch (ClientHandlerException | UniformInterfaceException | IOException e) {
					System.out.println("[ERROR] Exception parsing Announcement JSON: " + e);
				}
				if (unirAssignments != null) {
					// Obtener listado de tareas pendientes (Assignment)
					List<AssignmentCollection> assignmentList = unirAssignments.getAssignmentCollection();
					for(AssignmentCollection assignment:assignmentList){
						if(assignment.getStatus().compareTo("Abierto") == 0 ){
							assignmentResult.add(assignment);
						}
					}
					if (assignmentResult != null) {
						System.out.println("[DEBUG] Tareas pendientes: " + assignmentResult.size());
					}
				}
			}
		}
		return assignmentResult;
	}
}
