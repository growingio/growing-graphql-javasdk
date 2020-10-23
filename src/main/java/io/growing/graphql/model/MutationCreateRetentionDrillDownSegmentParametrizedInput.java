package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createRetentionDrillDownSegment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationCreateRetentionDrillDownSegmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private RetentionDrillDownSegmentInputDto retentionDrillDownSegment;

    public MutationCreateRetentionDrillDownSegmentParametrizedInput() {
    }

    public MutationCreateRetentionDrillDownSegmentParametrizedInput(RetentionDrillDownSegmentInputDto retentionDrillDownSegment) {
        this.retentionDrillDownSegment = retentionDrillDownSegment;
    }

    public MutationCreateRetentionDrillDownSegmentParametrizedInput retentionDrillDownSegment(RetentionDrillDownSegmentInputDto retentionDrillDownSegment) {
        this.retentionDrillDownSegment = retentionDrillDownSegment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (retentionDrillDownSegment != null) {
            joiner.add("retentionDrillDownSegment: " + GraphQLRequestSerializer.getEntry(retentionDrillDownSegment));
        }
        return joiner.toString();
    }

}
