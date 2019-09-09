
package es.ignacio.serranov.campusUnir.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "announcementId",
    "attachments",
    "body",
    "channel",
    "createdByDisplayName",
    "createdOn",
    "id",
    "siteId",
    "siteTitle",
    "title",
    "entityReference",
    "entityURL",
    "entityId",
    "entityTitle"
})
public class AnnouncementCollection {

    @JsonProperty("announcementId")
    private String announcementId;
    @JsonProperty("attachments")
    private List<Object> attachments = null;
    @JsonProperty("body")
    private String body;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("createdByDisplayName")
    private String createdByDisplayName;
    @JsonProperty("createdOn")
    private Long createdOn;
    @JsonProperty("id")
    private String id;
    @JsonProperty("siteId")
    private String siteId;
    @JsonProperty("siteTitle")
    private String siteTitle;
    @JsonProperty("title")
    private String title;
    @JsonProperty("entityReference")
    private String entityReference;
    @JsonProperty("entityURL")
    private String entityURL;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("entityTitle")
    private String entityTitle;

    @JsonProperty("announcementId")
    public String getAnnouncementId() {
        return announcementId;
    }

    @JsonProperty("announcementId")
    public void setAnnouncementId(String announcementId) {
        this.announcementId = announcementId;
    }

    @JsonProperty("attachments")
    public List<Object> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("createdByDisplayName")
    public String getCreatedByDisplayName() {
        return createdByDisplayName;
    }

    @JsonProperty("createdByDisplayName")
    public void setCreatedByDisplayName(String createdByDisplayName) {
        this.createdByDisplayName = createdByDisplayName;
    }

    @JsonProperty("createdOn")
    public Long getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("createdOn")
    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("siteId")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("siteId")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("siteTitle")
    public String getSiteTitle() {
        return siteTitle;
    }

    @JsonProperty("siteTitle")
    public void setSiteTitle(String siteTitle) {
        this.siteTitle = siteTitle;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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

    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
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
