package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userEventsTrend in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryUserEventsTrendParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private UserEventTypeDto type;
    private String timeRange;
    private java.lang.Long interval;
    private java.util.List<String> eventKeys;

    public QueryUserEventsTrendParametrizedInput() {
    }

    public QueryUserEventsTrendParametrizedInput(String projectId, String id, UserEventTypeDto type, String timeRange, java.lang.Long interval, java.util.List<String> eventKeys) {
        this.projectId = projectId;
        this.id = id;
        this.type = type;
        this.timeRange = timeRange;
        this.interval = interval;
        this.eventKeys = eventKeys;
    }

    public QueryUserEventsTrendParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryUserEventsTrendParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryUserEventsTrendParametrizedInput type(UserEventTypeDto type) {
        this.type = type;
        return this;
    }

    public QueryUserEventsTrendParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public QueryUserEventsTrendParametrizedInput interval(java.lang.Long interval) {
        this.interval = interval;
        return this;
    }

    public QueryUserEventsTrendParametrizedInput eventKeys(java.util.List<String> eventKeys) {
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
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (interval != null) {
            joiner.add("interval: " + GraphQLRequestSerializer.getEntry(interval));
        }
        if (eventKeys != null) {
            joiner.add("eventKeys: " + GraphQLRequestSerializer.getEntry(eventKeys));
        }
        return joiner.toString();
    }

}
