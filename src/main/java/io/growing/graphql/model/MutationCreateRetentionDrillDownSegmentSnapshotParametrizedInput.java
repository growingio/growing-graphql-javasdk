package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createRetentionDrillDownSegmentSnapshot in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private RetentionDrillDownSegmentInputDto retentionDrillDownSegment;

    public MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput() {
    }

    public MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput(RetentionDrillDownSegmentInputDto retentionDrillDownSegment) {
        this.retentionDrillDownSegment = retentionDrillDownSegment;
    }

    public MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput retentionDrillDownSegment(RetentionDrillDownSegmentInputDto retentionDrillDownSegment) {
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
