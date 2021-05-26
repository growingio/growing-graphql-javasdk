package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field logs in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryLogsParametrizedInput implements GraphQLParametrizedInput {

    private AuditLogQueryInputDto q;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private Integer offset;
    private Integer limit;

    public QueryLogsParametrizedInput() {
    }

    public QueryLogsParametrizedInput(AuditLogQueryInputDto q, String timeRange, Integer offset, Integer limit) {
        this.q = q;
        this.timeRange = timeRange;
        this.offset = offset;
        this.limit = limit;
    }

    public QueryLogsParametrizedInput q(AuditLogQueryInputDto q) {
        this.q = q;
        return this;
    }

    public QueryLogsParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public QueryLogsParametrizedInput offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public QueryLogsParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (offset != null) {
            joiner.add("offset: " + GraphQLRequestSerializer.getEntry(offset));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        return joiner.toString();
    }

}
