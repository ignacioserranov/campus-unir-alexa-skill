
package es.ignacio.serranov.campusUnir.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "access",
    "allPurposeItemText",
    "attachments",
    "authorLastModified",
    "authors",
    "closeTime",
    "closeTimeString",
    "content",
    "contentReference",
    "context",
    "creator",
    "dropDeadTime",
    "dropDeadTimeString",
    "dueTime",
    "dueTimeString",
    "gradeScale",
    "gradeScaleMaxPoints",
    "gradebookItemId",
    "gradebookItemName",
    "groups",
    "id",
    "instructions",
    "modelAnswerText",
    "openTime",
    "openTimeString",
    "position_order",
    "privateNoteText",
    "section",
    "status",
    "submissionType",
    "timeCreated",
    "timeLastModified",
    "title",
    "allowResubmission",
    "draft",
    "entityReference",
    "entityURL",
    "entityId",
    "entityTitle"
})
public class AssignmentCollection {

    @JsonProperty("access")
    private Access access;
    @JsonProperty("allPurposeItemText")
    private Object allPurposeItemText;
    @JsonProperty("attachments")
    private List<Attachment> attachments = null;
    @JsonProperty("authorLastModified")
    private String authorLastModified;
    @JsonProperty("authors")
    private List<Object> authors = null;
    @JsonProperty("closeTime")
    private CloseTime closeTime;
    @JsonProperty("closeTimeString")
    private String closeTimeString;
    @JsonProperty("content")
    private Object content;
    @JsonProperty("contentReference")
    private String contentReference;
    @JsonProperty("context")
    private String context;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("dropDeadTime")
    private DropDeadTime dropDeadTime;
    @JsonProperty("dropDeadTimeString")
    private String dropDeadTimeString;
    @JsonProperty("dueTime")
    private DueTime dueTime;
    @JsonProperty("dueTimeString")
    private String dueTimeString;
    @JsonProperty("gradeScale")
    private String gradeScale;
    @JsonProperty("gradeScaleMaxPoints")
    private Object gradeScaleMaxPoints;
    @JsonProperty("gradebookItemId")
    private Object gradebookItemId;
    @JsonProperty("gradebookItemName")
    private Object gradebookItemName;
    @JsonProperty("groups")
    private List<Object> groups = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("modelAnswerText")
    private Object modelAnswerText;
    @JsonProperty("openTime")
    private OpenTime openTime;
    @JsonProperty("openTimeString")
    private String openTimeString;
    @JsonProperty("position_order")
    private Long positionOrder;
    @JsonProperty("privateNoteText")
    private Object privateNoteText;
    @JsonProperty("section")
    private String section;
    @JsonProperty("status")
    private String status;
    @JsonProperty("submissionType")
    private String submissionType;
    @JsonProperty("timeCreated")
    private TimeCreated timeCreated;
    @JsonProperty("timeLastModified")
    private TimeLastModified timeLastModified;
    @JsonProperty("title")
    private String title;
    @JsonProperty("allowResubmission")
    private Boolean allowResubmission;
    @JsonProperty("draft")
    private Boolean draft;
    @JsonProperty("entityReference")
    private String entityReference;
    @JsonProperty("entityURL")
    private String entityURL;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("entityTitle")
    private String entityTitle;

    @JsonProperty("access")
    public Access getAccess() {
        return access;
    }

    @JsonProperty("access")
    public void setAccess(Access access) {
        this.access = access;
    }

    @JsonProperty("allPurposeItemText")
    public Object getAllPurposeItemText() {
        return allPurposeItemText;
    }

    @JsonProperty("allPurposeItemText")
    public void setAllPurposeItemText(Object allPurposeItemText) {
        this.allPurposeItemText = allPurposeItemText;
    }

    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("authorLastModified")
    public String getAuthorLastModified() {
        return authorLastModified;
    }

    @JsonProperty("authorLastModified")
    public void setAuthorLastModified(String authorLastModified) {
        this.authorLastModified = authorLastModified;
    }

    @JsonProperty("authors")
    public List<Object> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<Object> authors) {
        this.authors = authors;
    }

    @JsonProperty("closeTime")
    public CloseTime getCloseTime() {
        return closeTime;
    }

    @JsonProperty("closeTime")
    public void setCloseTime(CloseTime closeTime) {
        this.closeTime = closeTime;
    }

    @JsonProperty("closeTimeString")
    public String getCloseTimeString() {
        return closeTimeString;
    }

    @JsonProperty("closeTimeString")
    public void setCloseTimeString(String closeTimeString) {
        this.closeTimeString = closeTimeString;
    }

    @JsonProperty("content")
    public Object getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Object content) {
        this.content = content;
    }

    @JsonProperty("contentReference")
    public String getContentReference() {
        return contentReference;
    }

    @JsonProperty("contentReference")
    public void setContentReference(String contentReference) {
        this.contentReference = contentReference;
    }

    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("dropDeadTime")
    public DropDeadTime getDropDeadTime() {
        return dropDeadTime;
    }

    @JsonProperty("dropDeadTime")
    public void setDropDeadTime(DropDeadTime dropDeadTime) {
        this.dropDeadTime = dropDeadTime;
    }

    @JsonProperty("dropDeadTimeString")
    public String getDropDeadTimeString() {
        return dropDeadTimeString;
    }

    @JsonProperty("dropDeadTimeString")
    public void setDropDeadTimeString(String dropDeadTimeString) {
        this.dropDeadTimeString = dropDeadTimeString;
    }

    @JsonProperty("dueTime")
    public DueTime getDueTime() {
        return dueTime;
    }

    @JsonProperty("dueTime")
    public void setDueTime(DueTime dueTime) {
        this.dueTime = dueTime;
    }

    @JsonProperty("dueTimeString")
    public String getDueTimeString() {
        return dueTimeString;
    }

    @JsonProperty("dueTimeString")
    public void setDueTimeString(String dueTimeString) {
        this.dueTimeString = dueTimeString;
    }

    @JsonProperty("gradeScale")
    public String getGradeScale() {
        return gradeScale;
    }

    @JsonProperty("gradeScale")
    public void setGradeScale(String gradeScale) {
        this.gradeScale = gradeScale;
    }

    @JsonProperty("gradeScaleMaxPoints")
    public Object getGradeScaleMaxPoints() {
        return gradeScaleMaxPoints;
    }

    @JsonProperty("gradeScaleMaxPoints")
    public void setGradeScaleMaxPoints(Object gradeScaleMaxPoints) {
        this.gradeScaleMaxPoints = gradeScaleMaxPoints;
    }

    @JsonProperty("gradebookItemId")
    public Object getGradebookItemId() {
        return gradebookItemId;
    }

    @JsonProperty("gradebookItemId")
    public void setGradebookItemId(Object gradebookItemId) {
        this.gradebookItemId = gradebookItemId;
    }

    @JsonProperty("gradebookItemName")
    public Object getGradebookItemName() {
        return gradebookItemName;
    }

    @JsonProperty("gradebookItemName")
    public void setGradebookItemName(Object gradebookItemName) {
        this.gradebookItemName = gradebookItemName;
    }

    @JsonProperty("groups")
    public List<Object> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @JsonProperty("modelAnswerText")
    public Object getModelAnswerText() {
        return modelAnswerText;
    }

    @JsonProperty("modelAnswerText")
    public void setModelAnswerText(Object modelAnswerText) {
        this.modelAnswerText = modelAnswerText;
    }

    @JsonProperty("openTime")
    public OpenTime getOpenTime() {
        return openTime;
    }

    @JsonProperty("openTime")
    public void setOpenTime(OpenTime openTime) {
        this.openTime = openTime;
    }

    @JsonProperty("openTimeString")
    public String getOpenTimeString() {
        return openTimeString;
    }

    @JsonProperty("openTimeString")
    public void setOpenTimeString(String openTimeString) {
        this.openTimeString = openTimeString;
    }

    @JsonProperty("position_order")
    public Long getPositionOrder() {
        return positionOrder;
    }

    @JsonProperty("position_order")
    public void setPositionOrder(Long positionOrder) {
        this.positionOrder = positionOrder;
    }

    @JsonProperty("privateNoteText")
    public Object getPrivateNoteText() {
        return privateNoteText;
    }

    @JsonProperty("privateNoteText")
    public void setPrivateNoteText(Object privateNoteText) {
        this.privateNoteText = privateNoteText;
    }

    @JsonProperty("section")
    public String getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(String section) {
        this.section = section;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("submissionType")
    public String getSubmissionType() {
        return submissionType;
    }

    @JsonProperty("submissionType")
    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    @JsonProperty("timeCreated")
    public TimeCreated getTimeCreated() {
        return timeCreated;
    }

    @JsonProperty("timeCreated")
    public void setTimeCreated(TimeCreated timeCreated) {
        this.timeCreated = timeCreated;
    }

    @JsonProperty("timeLastModified")
    public TimeLastModified getTimeLastModified() {
        return timeLastModified;
    }

    @JsonProperty("timeLastModified")
    public void setTimeLastModified(TimeLastModified timeLastModified) {
        this.timeLastModified = timeLastModified;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("allowResubmission")
    public Boolean getAllowResubmission() {
        return allowResubmission;
    }

    @JsonProperty("allowResubmission")
    public void setAllowResubmission(Boolean allowResubmission) {
        this.allowResubmission = allowResubmission;
    }

    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    @JsonProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
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
