package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFunnelAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationCreateFunnelAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private FunnelAnalysisInputDto funnelAnalysis;

    public MutationCreateFunnelAnalysisParametrizedInput() {
    }

    public MutationCreateFunnelAnalysisParametrizedInput(FunnelAnalysisInputDto funnelAnalysis) {
        this.funnelAnalysis = funnelAnalysis;
    }

    public MutationCreateFunnelAnalysisParametrizedInput funnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) {
        this.funnelAnalysis = funnelAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (funnelAnalysis != null) {
            joiner.add("funnelAnalysis: " + GraphQLRequestSerializer.getEntry(funnelAnalysis));
        }
        return joiner.toString();
    }

}
