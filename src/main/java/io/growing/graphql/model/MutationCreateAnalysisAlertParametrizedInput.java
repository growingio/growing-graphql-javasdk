package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createAnalysisAlert in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateAnalysisAlertParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private AnalysisAlertsInputDto analysisAlert;

    public MutationCreateAnalysisAlertParametrizedInput() {
    }

    public MutationCreateAnalysisAlertParametrizedInput(String projectId, AnalysisAlertsInputDto analysisAlert) {
        this.projectId = projectId;
        this.analysisAlert = analysisAlert;
    }

    public MutationCreateAnalysisAlertParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateAnalysisAlertParametrizedInput analysisAlert(AnalysisAlertsInputDto analysisAlert) {
        this.analysisAlert = analysisAlert;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (analysisAlert != null) {
            joiner.add("analysisAlert: " + GraphQLRequestSerializer.getEntry(analysisAlert));
        }
        return joiner.toString();
    }

}
