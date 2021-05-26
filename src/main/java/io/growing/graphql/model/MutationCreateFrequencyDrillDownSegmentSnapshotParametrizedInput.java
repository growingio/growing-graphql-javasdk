package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFrequencyDrillDownSegmentSnapshot in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment;

    public MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput() {
    }

    public MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput(String projectId, FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
        this.projectId = projectId;
        this.frequencyDrillDownSegment = frequencyDrillDownSegment;
    }

    public MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput frequencyDrillDownSegment(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
        this.frequencyDrillDownSegment = frequencyDrillDownSegment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (frequencyDrillDownSegment != null) {
            joiner.add("frequencyDrillDownSegment: " + GraphQLRequestSerializer.getEntry(frequencyDrillDownSegment));
        }
        return joiner.toString();
    }

}
