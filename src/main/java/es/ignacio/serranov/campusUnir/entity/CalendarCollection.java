
package es.ignacio.serranov.campusUnir.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "assignmentId",
    "creator",
    "duration",
    "eventId",
    "firstTime",
    "recurrenceRule",
    "reference",
    "siteId",
    "siteName",
    "title",
    "type",
    "entityReference",
    "entityURL",
    "entityTitle"
})
public class CalendarCollection {

    @JsonProperty("assignmentId")
    private String assignmentId;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("duration")
    private Long duration;
    @JsonProperty("eventId")
    private String eventId;
    @JsonProperty("firstTime")
    private FirstTime firstTime;
    @JsonProperty("recurrenceRule")
    private Object recurrenceRule;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("siteId")
    private String siteId;
    @JsonProperty("siteName")
    private String siteName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("type")
    private String type;
    @JsonProperty("entityReference")
    private String entityReference;
    @JsonProperty("entityURL")
    private String entityURL;
    @JsonProperty("entityTitle")
    private String entityTitle;

    @JsonProperty("assignmentId")
    public String getAssignmentId() {
        return assignmentId;
    }

    @JsonProperty("assignmentId")
    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @JsonProperty("eventId")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("eventId")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("firstTime")
    public FirstTime getFirstTime() {
        return firstTime;
    }

    @JsonProperty("firstTime")
    public void setFirstTime(FirstTime firstTime) {
        this.firstTime = firstTime;
    }

    @JsonProperty("recurrenceRule")
    public Object getRecurrenceRule() {
        return recurrenceRule;
    }

    @JsonProperty("recurrenceRule")
    public void setRecurrenceRule(Object recurrenceRule) {
        this.recurrenceRule = recurrenceRule;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @JsonProperty("siteId")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("siteId")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("siteName")
    public String getSiteName() {
        return siteName;
    }

    @JsonProperty("siteName")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("entityReference")
    public String getEntityReference() {
        return entityReference;
    }

    @JsonProperty("entityReference")
    public void setEntityReference(String entityReference) {
        this.entityReference = entityReference;
    }

    @JsonProperty("entityURL")
    public String getEntityURL() {
        return entityURL;
    }

    @JsonProperty("entityURL")
    public void setEntityURL(String entityURL) {
        this.entityURL = entityURL;
    }

    @JsonProperty("entityTitle")
    public String getEntityTitle() {
        return entityTitle;
    }

    @JsonProperty("entityTitle")
    public void setEntityTitle(String entityTitle) {
        this.entityTitle = entityTitle;
    }

}
