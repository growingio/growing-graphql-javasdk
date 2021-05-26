package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFrequencyAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateFrequencyAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private FrequencyAnalysisInputDto frequencyAnalysis;

    public MutationCreateFrequencyAnalysisParametrizedInput() {
    }

    public MutationCreateFrequencyAnalysisParametrizedInput(String projectId, FrequencyAnalysisInputDto frequencyAnalysis) {
        this.projectId = projectId;
        this.frequencyAnalysis = frequencyAnalysis;
    }

    public MutationCreateFrequencyAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateFrequencyAnalysisParametrizedInput frequencyAnalysis(FrequencyAnalysisInputDto frequencyAnalysis) {
        this.frequencyAnalysis = frequencyAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (frequencyAnalysis != null) {
            joiner.add("frequencyAnalysis: " + GraphQLRequestSerializer.getEntry(frequencyAnalysis));
        }
        return joiner.toString();
    }

}
