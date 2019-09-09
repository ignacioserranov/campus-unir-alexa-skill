package es.ignacio.serranov.campusUnir;

public class Constants {
	public static String sakaiURL = "https://campusvirtual.unir.net";
	public static String loginServiceURL = sakaiURL + "/portal/relogin";
	public static String sessionServiceURL = sakaiURL + "/direct/session.json";
	public static String siteServiceURL = sakaiURL + "/direct/site.json";
	public static String announcementServiceURL = sakaiURL + "/direct/announcement/user.json";
	public static String calendarServiceURL = sakaiURL + "/direct/calendar/my.json";
	public static String assignmentServiceURL = sakaiURL + "/direct/assignment/my.json";
	public static String calendarFirstDateParam = "firstDate";
	public static String calendarLastDateParam = "lastDate";
	protected static String sakaiUserName = "USERNAME";
	protected static String sakaiPassword = "PASSWORD";
}
