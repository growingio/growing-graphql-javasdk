package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateAnalysisAlert in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateAnalysisAlertParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private AnalysisAlertsInputDto analysisAlert;

    public MutationUpdateAnalysisAlertParametrizedInput() {
    }

    public MutationUpdateAnalysisAlertParametrizedInput(String projectId, String id, AnalysisAlertsInputDto analysisAlert) {
        this.projectId = projectId;
        this.id = id;
        this.analysisAlert = analysisAlert;
    }

    public MutationUpdateAnalysisAlertParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationUpdateAnalysisAlertParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateAnalysisAlertParametrizedInput analysisAlert(AnalysisAlertsInputDto analysisAlert) {
        this.analysisAlert = analysisAlert;
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
        if (analysisAlert != null) {
            joiner.add("analysisAlert: " + GraphQLRequestSerializer.getEntry(analysisAlert));
        }
        return joiner.toString();
    }

}
