package es.ignacio.serranov.campusUnir.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SiteOwner {

    private String userDisplayName;
    private String userEntityURL;
    private String userId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserEntityURL() {
        return userEntityURL;
    }

    public void setUserEntityURL(String userEntityURL) {
        this.userEntityURL = userEntityURL;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userDisplayName", userDisplayName).append("userEntityURL", userEntityURL).append("userId", userId).append("additionalProperties", additionalProperties).toString();
    }

}
