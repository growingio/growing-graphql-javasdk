package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userEventCount in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryUserEventCountParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private java.util.List<String> eventKeys;

    public QueryUserEventCountParametrizedInput() {
    }

    public QueryUserEventCountParametrizedInput(String projectId, String id, String timeRange, java.util.List<String> eventKeys) {
        this.projectId = projectId;
        this.id = id;
        this.timeRange = timeRange;
        this.eventKeys = eventKeys;
    }

    public QueryUserEventCountParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryUserEventCountParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryUserEventCountParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public QueryUserEventCountParametrizedInput eventKeys(java.util.List<String> eventKeys) {
        this.eventKeys = eventKeys;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (eventKeys != null) {
            joiner.add("eventKeys: " + GraphQLRequestSerializer.getEntry(eventKeys));
        }
        return joiner.toString();
    }

}
