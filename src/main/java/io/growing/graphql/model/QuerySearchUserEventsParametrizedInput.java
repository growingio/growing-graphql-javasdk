package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field searchUserEvents in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class QuerySearchUserEventsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String q;
    private String timeRange;

    public QuerySearchUserEventsParametrizedInput() {
    }

    public QuerySearchUserEventsParametrizedInput(String id, String q, String timeRange) {
        this.id = id;
        this.q = q;
        this.timeRange = timeRange;
    }

    public QuerySearchUserEventsParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QuerySearchUserEventsParametrizedInput q(String q) {
        this.q = q;
        return this;
    }

    public QuerySearchUserEventsParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        return joiner.toString();
    }

}
