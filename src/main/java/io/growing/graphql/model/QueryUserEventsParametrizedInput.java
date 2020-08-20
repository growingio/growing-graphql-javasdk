package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userEvents in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class QueryUserEventsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private UserEventTypeDto type;
    private String timeRange;
    private Integer first;
    private String after;
    private Integer last;
    private String before;

    public QueryUserEventsParametrizedInput() {
    }

    public QueryUserEventsParametrizedInput(String id, UserEventTypeDto type, String timeRange, Integer first, String after, Integer last, String before) {
        this.id = id;
        this.type = type;
        this.timeRange = timeRange;
        this.first = first;
        this.after = after;
        this.last = last;
        this.before = before;
    }

    public QueryUserEventsParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryUserEventsParametrizedInput type(UserEventTypeDto type) {
        this.type = type;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
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
        return joiner.toString();
    }

}
