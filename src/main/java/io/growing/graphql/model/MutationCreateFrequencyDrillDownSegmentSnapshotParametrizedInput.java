package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFrequencyDrillDownSegmentSnapshot in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment;

    public MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput() {
    }

    public MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
        this.frequencyDrillDownSegment = frequencyDrillDownSegment;
    }

    public MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput frequencyDrillDownSegment(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
        this.frequencyDrillDownSegment = frequencyDrillDownSegment;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (frequencyDrillDownSegment != null) {
            joiner.add("frequencyDrillDownSegment: " + GraphQLRequestSerializer.getEntry(frequencyDrillDownSegment));
        }
        return joiner.toString();
    }

}
