package es.ignacio.serranov.campusUnir.entity;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class SiteCollection {

    private Object contactEmail;
    private Object contactName;
    private long createdDate;
    private CreatedTime createdTime;
    private Object description;
    private String htmlDescription;
    private String htmlShortDescription;
    private Object iconUrl;
    private Object iconUrlFull;
    private String id;
    private Object infoUrl;
    private Object infoUrlFull;
    private Object joinerRole;
    private long lastModified;
    private String maintainRole;
    private long modifiedDate;
    private ModifiedTime modifiedTime;
    private String owner;
    private Props props;
    private Object providerGroupId;
    private String reference;
    private Object shortDescription;
    private Object siteGroups;
    private SiteOwner siteOwner;
    private List<SitePage> sitePages = null;
    private Object skin;
    private Object softlyDeletedDate;
    private String title;
    private String type;
    private List<String> userRoles = null;
    private Boolean activeEdit;
    private Boolean customPageOrdered;
    private Boolean empty;
    private Boolean joinable;
    private Boolean pubView;
    private Boolean published;
    private Boolean softlyDeleted;
    private String entityReference;
    private String entityURL;
    private String entityId;
    private String entityTitle;

    public Object getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(Object contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Object getContactName() {
        return contactName;
    }

    public void setContactName(Object contactName) {
        this.contactName = contactName;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public CreatedTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(CreatedTime createdTime) {
        this.createdTime = createdTime;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public String getHtmlShortDescription() {
        return htmlShortDescription;
    }

    public void setHtmlShortDescription(String htmlShortDescription) {
        this.htmlShortDescription = htmlShortDescription;
    }

    public Object getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(Object iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Object getIconUrlFull() {
        return iconUrlFull;
    }

    public void setIconUrlFull(Object iconUrlFull) {
        this.iconUrlFull = iconUrlFull;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(Object infoUrl) {
        this.infoUrl = infoUrl;
    }

    public Object getInfoUrlFull() {
        return infoUrlFull;
    }

    public void setInfoUrlFull(Object infoUrlFull) {
        this.infoUrlFull = infoUrlFull;
    }

    public Object getJoinerRole() {
        return joinerRole;
    }

    public void setJoinerRole(Object joinerRole) {
        this.joinerRole = joinerRole;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public String getMaintainRole() {
        return maintainRole;
    }

    public void setMaintainRole(String maintainRole) {
        this.maintainRole = maintainRole;
    }

    public long getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ModifiedTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(ModifiedTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Props getProps() {
        return props;
    }

    public void setProps(Props props) {
        this.props = props;
    }

    public Object getProviderGroupId() {
        return providerGroupId;
    }

    public void setProviderGroupId(Object providerGroupId) {
        this.providerGroupId = providerGroupId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Object getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(Object shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Object getSiteGroups() {
        return siteGroups;
    }

    public void setSiteGroups(Object siteGroups) {
        this.siteGroups = siteGroups;
    }

    public SiteOwner getSiteOwner() {
        return siteOwner;
    }

    public void setSiteOwner(SiteOwner siteOwner) {
        this.siteOwner = siteOwner;
    }

    public List<SitePage> getSitePages() {
        return sitePages;
    }

    public void setSitePages(List<SitePage> sitePages) {
        this.sitePages = sitePages;
    }

    public Object getSkin() {
        return skin;
    }

    public void setSkin(Object skin) {
        this.skin = skin;
    }

    public Object getSoftlyDeletedDate() {
        return softlyDeletedDate;
    }

    public void setSoftlyDeletedDate(Object softlyDeletedDate) {
        this.softlyDeletedDate = softlyDeletedDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<String> userRoles) {
        this.userRoles = userRoles;
    }

    public Boolean getActiveEdit() {
        return activeEdit;
    }

    public void setActiveEdit(Boolean activeEdit) {
        this.activeEdit = activeEdit;
    }

    public Boolean getCustomPageOrdered() {
        return customPageOrdered;
    }

    public void setCustomPageOrdered(Boolean customPageOrdered) {
        this.customPageOrdered = customPageOrdered;
    }

    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public Boolean getJoinable() {
        return joinable;
    }

    public void setJoinable(Boolean joinable) {
        this.joinable = joinable;
    }

    public Boolean getPubView() {
        return pubView;
    }

    public void setPubView(Boolean pubView) {
        this.pubView = pubView;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getSoftlyDeleted() {
        return softlyDeleted;
    }

    public void setSoftlyDeleted(Boolean softlyDeleted) {
        this.softlyDeleted = softlyDeleted;
    }

    public String getEntityReference() {
        return entityReference;
    }

    public void setEntityReference(String entityReference) {
        this.entityReference = entityReference;
    }

    public String getEntityURL() {
        return entityURL;
    }

    public void setEntityURL(String entityURL) {
        this.entityURL = entityURL;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityTitle() {
        return entityTitle;
    }

    public void setEntityTitle(String entityTitle) {
        this.entityTitle = entityTitle;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contactEmail", contactEmail).append("contactName", contactName).append("createdDate", createdDate).append("createdTime", createdTime).append("description", description).append("htmlDescription", htmlDescription).append("htmlShortDescription", htmlShortDescription).append("iconUrl", iconUrl).append("iconUrlFull", iconUrlFull).append("id", id).append("infoUrl", infoUrl).append("infoUrlFull", infoUrlFull).append("joinerRole", joinerRole).append("lastModified", lastModified).append("maintainRole", maintainRole).append("modifiedDate", modifiedDate).append("modifiedTime", modifiedTime).append("owner", owner).append("props", props).append("providerGroupId", providerGroupId).append("reference", reference).append("shortDescription", shortDescription).append("siteGroups", siteGroups).append("siteOwner", siteOwner).append("sitePages", sitePages).append("skin", skin).append("softlyDeletedDate", softlyDeletedDate).append("title", title).append("type", type).append("userRoles", userRoles).append("activeEdit", activeEdit).append("customPageOrdered", customPageOrdered).append("empty", empty).append("joinable", joinable).append("pubView", pubView).append("published", published).append("softlyDeleted", softlyDeleted).append("entityReference", entityReference).append("entityURL", entityURL).append("entityId", entityId).append("entityTitle", entityTitle).toString();
    }

}
