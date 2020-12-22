package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userEvents in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryUserEventsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<UserEventTypeDto> types;
    private String timeRange;
    private Integer first;
    private String after;
    private Integer last;
    private String before;
    private Integer limit;
    private FilterInputDto filter;

    public QueryUserEventsParametrizedInput() {
    }

    public QueryUserEventsParametrizedInput(String projectId, String id, java.util.List<UserEventTypeDto> types, String timeRange, Integer first, String after, Integer last, String before, Integer limit, FilterInputDto filter) {
        this.projectId = projectId;
        this.id = id;
        this.types = types;
        this.timeRange = timeRange;
        this.first = first;
        this.after = after;
        this.last = last;
        this.before = before;
        this.limit = limit;
        this.filter = filter;
    }

    public QueryUserEventsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryUserEventsParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryUserEventsParametrizedInput types(java.util.List<UserEventTypeDto> types) {
        this.types = types;
        return this;
    }

    public QueryUserEventsParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public QueryUserEventsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public QueryUserEventsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public QueryUserEventsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public QueryUserEventsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public QueryUserEventsParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public QueryUserEventsParametrizedInput filter(FilterInputDto filter) {
        this.filter = filter;
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
        if (types != null) {
            joiner.add("types: " + GraphQLRequestSerializer.getEntry(types));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        return joiner.toString();
    }

}
