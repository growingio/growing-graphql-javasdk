package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createRetentionDrillDownSegmentSnapshot in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private RetentionDrillDownSegmentInputDto retentionDrillDownSegment;

    public MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput() {
    }

    public MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput(String projectId, RetentionDrillDownSegmentInputDto retentionDrillDownSegment) {
        this.projectId = projectId;
        this.retentionDrillDownSegment = retentionDrillDownSegment;
    }

    public MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput retentionDrillDownSegment(RetentionDrillDownSegmentInputDto retentionDrillDownSegment) {
        this.retentionDrillDownSegment = retentionDrillDownSegment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (retentionDrillDownSegment != null) {
            joiner.add("retentionDrillDownSegment: " + GraphQLRequestSerializer.getEntry(retentionDrillDownSegment));
        }
        return joiner.toString();
    }

}
