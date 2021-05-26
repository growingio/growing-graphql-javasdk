package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateKpiAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createKpiAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateKpiAnalysisMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setKpiAnalysis(KpiAnalysisInputDto kpiAnalysis) {
        this.input.put("kpiAnalysis", kpiAnalysis);
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
        private KpiAnalysisInputDto kpiAnalysis;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setKpiAnalysis(KpiAnalysisInputDto kpiAnalysis) {
            this.kpiAnalysis = kpiAnalysis;
            return this;
        }


        public CreateKpiAnalysisMutationRequest build() {
            CreateKpiAnalysisMutationRequest obj = new CreateKpiAnalysisMutationRequest();
            obj.setProjectId(projectId);
            obj.setKpiAnalysis(kpiAnalysis);
            return obj;
        }

    }
}
