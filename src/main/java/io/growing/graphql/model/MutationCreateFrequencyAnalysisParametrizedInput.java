package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFrequencyAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class MutationCreateFrequencyAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private FrequencyAnalysisInputDto frequencyAnalysis;

    public MutationCreateFrequencyAnalysisParametrizedInput() {
    }

    public MutationCreateFrequencyAnalysisParametrizedInput(FrequencyAnalysisInputDto frequencyAnalysis) {
        this.frequencyAnalysis = frequencyAnalysis;
    }

    public MutationCreateFrequencyAnalysisParametrizedInput frequencyAnalysis(FrequencyAnalysisInputDto frequencyAnalysis) {
        this.frequencyAnalysis = frequencyAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (frequencyAnalysis != null) {
            joiner.add("frequencyAnalysis: " + GraphQLRequestSerializer.getEntry(frequencyAnalysis));
        }
        return joiner.toString();
    }

}
