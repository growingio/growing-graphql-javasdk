package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateFrequencyAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationUpdateFrequencyAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private FrequencyAnalysisInputDto frequencyAnalysis;

    public MutationUpdateFrequencyAnalysisParametrizedInput() {
    }

    public MutationUpdateFrequencyAnalysisParametrizedInput(String id, FrequencyAnalysisInputDto frequencyAnalysis) {
        this.id = id;
        this.frequencyAnalysis = frequencyAnalysis;
    }

    public MutationUpdateFrequencyAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateFrequencyAnalysisParametrizedInput frequencyAnalysis(FrequencyAnalysisInputDto frequencyAnalysis) {
        this.frequencyAnalysis = frequencyAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (frequencyAnalysis != null) {
            joiner.add("frequencyAnalysis: " + GraphQLRequestSerializer.getEntry(frequencyAnalysis));
        }
        return joiner.toString();
    }

}
