
package es.ignacio.serranov.campusUnir.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SitePage {

    private String id;
    private Integer layout;
    private String layoutTitle;
    private Integer position;
//    private Props_ props;
    private String reference;
    private String siteId;
    private String skin;
    private String title;
    private Boolean titleCustom;
    private String titleUnir;
    private String url;
    private Boolean activeEdit;
    private Boolean homePage;
    private Boolean popUp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLayout() {
        return layout;
    }

    public void setLayout(Integer layout) {
        this.layout = layout;
    }

    public String getLayoutTitle() {
        return layoutTitle;
    }

    public void setLayoutTitle(String layoutTitle) {
        this.layoutTitle = layoutTitle;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

//    public Props_ getProps() {
//        return props;
//    }
//
//    public void setProps(Props_ props) {
//        this.props = props;
//    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getTitleCustom() {
        return titleCustom;
    }

    public void setTitleCustom(Boolean titleCustom) {
        this.titleCustom = titleCustom;
    }

    public String getTitleUnir() {
        return titleUnir;
    }

    public void setTitleUnir(String titleUnir) {
        this.titleUnir = titleUnir;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getActiveEdit() {
        return activeEdit;
    }

    public void setActiveEdit(Boolean activeEdit) {
        this.activeEdit = activeEdit;
    }

    public Boolean getHomePage() {
        return homePage;
    }

    public void setHomePage(Boolean homePage) {
        this.homePage = homePage;
    }

    public Boolean getPopUp() {
        return popUp;
    }

    public void setPopUp(Boolean popUp) {
        this.popUp = popUp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        //return new ToStringBuilder(this).append("id", id).append("layout", layout).append("layoutTitle", layoutTitle).append("position", position).append("props", props).append("reference", reference).append("siteId", siteId).append("skin", skin).append("title", title).append("titleCustom", titleCustom).append("titleUnir", titleUnir).append("url", url).append("activeEdit", activeEdit).append("homePage", homePage).append("popUp", popUp).append("additionalProperties", additionalProperties).toString();
    	return new ToStringBuilder(this).append("id", id).append("layout", layout).append("layoutTitle", layoutTitle).append("position", position).append("reference", reference).append("siteId", siteId).append("skin", skin).append("title", title).append("titleCustom", titleCustom).append("titleUnir", titleUnir).append("url", url).append("activeEdit", activeEdit).append("homePage", homePage).append("popUp", popUp).append("additionalProperties", additionalProperties).toString();
    }

}
