package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateKpiAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationUpdateKpiAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private KpiAnalysisInputDto kpiAnalysis;

    public MutationUpdateKpiAnalysisParametrizedInput() {
    }

    public MutationUpdateKpiAnalysisParametrizedInput(String projectId, String id, KpiAnalysisInputDto kpiAnalysis) {
        this.projectId = projectId;
        this.id = id;
        this.kpiAnalysis = kpiAnalysis;
    }

    public MutationUpdateKpiAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationUpdateKpiAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateKpiAnalysisParametrizedInput kpiAnalysis(KpiAnalysisInputDto kpiAnalysis) {
        this.kpiAnalysis = kpiAnalysis;
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
        if (kpiAnalysis != null) {
            joiner.add("kpiAnalysis: " + GraphQLRequestSerializer.getEntry(kpiAnalysis));
        }
        return joiner.toString();
    }

}
