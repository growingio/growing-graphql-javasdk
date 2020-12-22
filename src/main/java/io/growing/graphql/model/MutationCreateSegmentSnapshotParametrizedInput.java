package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createSegmentSnapshot in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateSegmentSnapshotParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private ComputeDefinitionInputDto compute;

    public MutationCreateSegmentSnapshotParametrizedInput() {
    }

    public MutationCreateSegmentSnapshotParametrizedInput(String projectId, ComputeDefinitionInputDto compute) {
        this.projectId = projectId;
        this.compute = compute;
    }

    public MutationCreateSegmentSnapshotParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateSegmentSnapshotParametrizedInput compute(ComputeDefinitionInputDto compute) {
        this.compute = compute;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (compute != null) {
            joiner.add("compute: " + GraphQLRequestSerializer.getEntry(compute));
        }
        return joiner.toString();
    }

}
