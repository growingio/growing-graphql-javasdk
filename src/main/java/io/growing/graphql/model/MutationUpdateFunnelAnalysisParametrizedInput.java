package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateFunnelAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateFunnelAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private FunnelAnalysisInputDto funnelAnalysis;

    public MutationUpdateFunnelAnalysisParametrizedInput() {
    }

    public MutationUpdateFunnelAnalysisParametrizedInput(String projectId, String id, FunnelAnalysisInputDto funnelAnalysis) {
        this.projectId = projectId;
        this.id = id;
        this.funnelAnalysis = funnelAnalysis;
    }

    public MutationUpdateFunnelAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationUpdateFunnelAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateFunnelAnalysisParametrizedInput funnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) {
        this.funnelAnalysis = funnelAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (funnelAnalysis != null) {
            joiner.add("funnelAnalysis: " + GraphQLRequestSerializer.getEntry(funnelAnalysis));
        }
        return joiner.toString();
    }

}
