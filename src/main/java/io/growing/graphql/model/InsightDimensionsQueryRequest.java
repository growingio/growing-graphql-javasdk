package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据中心的 insightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class InsightDimensionsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "insightDimensions";

    private Map<String, Object> input = new LinkedHashMap<>();

    public InsightDimensionsQueryRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setMeasurements(java.util.List<MeasurementInputDto> measurements) {
        this.input.put("measurements", measurements);
    }

    public void setTargetUsers(java.util.List<String> targetUsers) {
        this.input.put("targetUsers", targetUsers);
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
        private java.util.List<MeasurementInputDto> measurements;
        private java.util.List<String> targetUsers;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setMeasurements(java.util.List<MeasurementInputDto> measurements) {
            this.measurements = measurements;
            return this;
        }

        public Builder setTargetUsers(java.util.List<String> targetUsers) {
            this.targetUsers = targetUsers;
            return this;
        }


        public InsightDimensionsQueryRequest build() {
            InsightDimensionsQueryRequest obj = new InsightDimensionsQueryRequest();
            obj.setProjectId(projectId);
            obj.setMeasurements(measurements);
            obj.setTargetUsers(targetUsers);
            return obj;
        }

    }
}
