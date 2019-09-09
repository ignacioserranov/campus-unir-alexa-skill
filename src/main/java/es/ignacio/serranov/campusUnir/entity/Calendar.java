
package es.ignacio.serranov.campusUnir.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityPrefix",
    "calendar_collection"
})
public class Calendar {

    @JsonProperty("entityPrefix")
    private String entityPrefix;
    @JsonProperty("calendar_collection")
    private List<CalendarCollection> calendarCollection = null;

    @JsonProperty("entityPrefix")
    public String getEntityPrefix() {
        return entityPrefix;
    }

    @JsonProperty("entityPrefix")
    public void setEntityPrefix(String entityPrefix) {
        this.entityPrefix = entityPrefix;
    }

    @JsonProperty("calendar_collection")
    public List<CalendarCollection> getCalendarCollection() {
        return calendarCollection;
    }

    @JsonProperty("calendar_collection")
    public void setCalendarCollection(List<CalendarCollection> calendarCollection) {
        this.calendarCollection = calendarCollection;
    }

}
