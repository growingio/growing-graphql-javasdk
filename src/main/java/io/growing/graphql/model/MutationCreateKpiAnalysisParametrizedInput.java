package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createKpiAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateKpiAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private KpiAnalysisInputDto kpiAnalysis;

    public MutationCreateKpiAnalysisParametrizedInput() {
    }

    public MutationCreateKpiAnalysisParametrizedInput(String projectId, KpiAnalysisInputDto kpiAnalysis) {
        this.projectId = projectId;
        this.kpiAnalysis = kpiAnalysis;
    }

    public MutationCreateKpiAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateKpiAnalysisParametrizedInput kpiAnalysis(KpiAnalysisInputDto kpiAnalysis) {
        this.kpiAnalysis = kpiAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (kpiAnalysis != null) {
            joiner.add("kpiAnalysis: " + GraphQLRequestSerializer.getEntry(kpiAnalysis));
        }
        return joiner.toString();
    }

}
