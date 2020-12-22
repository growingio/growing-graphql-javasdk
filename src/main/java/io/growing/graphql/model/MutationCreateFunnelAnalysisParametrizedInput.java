package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createFunnelAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateFunnelAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private FunnelAnalysisInputDto funnelAnalysis;

    public MutationCreateFunnelAnalysisParametrizedInput() {
    }

    public MutationCreateFunnelAnalysisParametrizedInput(String projectId, FunnelAnalysisInputDto funnelAnalysis) {
        this.projectId = projectId;
        this.funnelAnalysis = funnelAnalysis;
    }

    public MutationCreateFunnelAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateFunnelAnalysisParametrizedInput funnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) {
        this.funnelAnalysis = funnelAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (funnelAnalysis != null) {
            joiner.add("funnelAnalysis: " + GraphQLRequestSerializer.getEntry(funnelAnalysis));
        }
        return joiner.toString();
    }

}
