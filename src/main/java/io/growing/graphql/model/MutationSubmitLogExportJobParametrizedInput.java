package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitLogExportJob in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationSubmitLogExportJobParametrizedInput implements GraphQLParametrizedInput {

    private AuditLogQueryInputDto q;
    @javax.validation.constraints.NotNull
    private String timeRange;

    public MutationSubmitLogExportJobParametrizedInput() {
    }

    public MutationSubmitLogExportJobParametrizedInput(AuditLogQueryInputDto q, String timeRange) {
        this.q = q;
        this.timeRange = timeRange;
    }

    public MutationSubmitLogExportJobParametrizedInput q(AuditLogQueryInputDto q) {
        this.q = q;
        return this;
    }

    public MutationSubmitLogExportJobParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
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
        return joiner.toString();
    }

}
