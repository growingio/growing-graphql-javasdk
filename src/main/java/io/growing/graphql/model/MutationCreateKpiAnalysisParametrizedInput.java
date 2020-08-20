package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createKpiAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationCreateKpiAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private KpiAnalysisInputDto kpiAnalysis;

    public MutationCreateKpiAnalysisParametrizedInput() {
    }

    public MutationCreateKpiAnalysisParametrizedInput(KpiAnalysisInputDto kpiAnalysis) {
        this.kpiAnalysis = kpiAnalysis;
    }

    public MutationCreateKpiAnalysisParametrizedInput kpiAnalysis(KpiAnalysisInputDto kpiAnalysis) {
        this.kpiAnalysis = kpiAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (kpiAnalysis != null) {
            joiner.add("kpiAnalysis: " + GraphQLRequestSerializer.getEntry(kpiAnalysis));
        }
        return joiner.toString();
    }

}
