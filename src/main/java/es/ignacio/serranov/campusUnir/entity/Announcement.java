
package es.ignacio.serranov.campusUnir.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityPrefix",
    "announcement_collection"
})
public class Announcement {

    @JsonProperty("entityPrefix")
    private String entityPrefix;
    @JsonProperty("announcement_collection")
    private List<AnnouncementCollection> announcementCollection = null;

    @JsonProperty("entityPrefix")
    public String getEntityPrefix() {
        return entityPrefix;
    }

    @JsonProperty("entityPrefix")
    public void setEntityPrefix(String entityPrefix) {
        this.entityPrefix = entityPrefix;
    }

    @JsonProperty("announcement_collection")
    public List<AnnouncementCollection> getAnnouncementCollection() {
        return announcementCollection;
    }

    @JsonProperty("announcement_collection")
    public void setAnnouncementCollection(List<AnnouncementCollection> announcementCollection) {
        this.announcementCollection = announcementCollection;
    }

}
