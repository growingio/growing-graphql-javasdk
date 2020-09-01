package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFrequencyDrillDownSegment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class MutationCreateFrequencyDrillDownSegmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment;

    public MutationCreateFrequencyDrillDownSegmentParametrizedInput() {
    }

    public MutationCreateFrequencyDrillDownSegmentParametrizedInput(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
        this.frequencyDrillDownSegment = frequencyDrillDownSegment;
    }

    public MutationCreateFrequencyDrillDownSegmentParametrizedInput frequencyDrillDownSegment(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) {
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
