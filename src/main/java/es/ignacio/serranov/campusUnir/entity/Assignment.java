
package es.ignacio.serranov.campusUnir.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityPrefix",
    "assignment_collection"
})
public class Assignment {

    @JsonProperty("entityPrefix")
    private String entityPrefix;
    @JsonProperty("assignment_collection")
    private List<AssignmentCollection> assignmentCollection = null;

    @JsonProperty("entityPrefix")
    public String getEntityPrefix() {
        return entityPrefix;
    }

    @JsonProperty("entityPrefix")
    public void setEntityPrefix(String entityPrefix) {
        this.entityPrefix = entityPrefix;
    }

    @JsonProperty("assignment_collection")
    public List<AssignmentCollection> getAssignmentCollection() {
        return assignmentCollection;
    }

    @JsonProperty("assignment_collection")
    public void setAssignmentCollection(List<AssignmentCollection> assignmentCollection) {
        this.assignmentCollection = assignmentCollection;
    }

}
