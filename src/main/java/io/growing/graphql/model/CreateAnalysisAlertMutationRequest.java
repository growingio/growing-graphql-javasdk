package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateAnalysisAlertMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createAnalysisAlert";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateAnalysisAlertMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setAnalysisAlert(AnalysisAlertsInputDto analysisAlert) {
        this.input.put("analysisAlert", analysisAlert);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String projectId;
        private AnalysisAlertsInputDto analysisAlert;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setAnalysisAlert(AnalysisAlertsInputDto analysisAlert) {
            this.analysisAlert = analysisAlert;
            return this;
        }


        public CreateAnalysisAlertMutationRequest build() {
            CreateAnalysisAlertMutationRequest obj = new CreateAnalysisAlertMutationRequest();
            obj.setProjectId(projectId);
            obj.setAnalysisAlert(analysisAlert);
            return obj;
        }

    }
}
