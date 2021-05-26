package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据中心的 InsightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterInsightDimensionsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "dataCenterInsightDimensions";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterInsightDimensionsQueryRequest() {
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

        private java.util.List<MeasurementInputDto> measurements;
        private java.util.List<String> targetUsers;

        public Builder() {
        }

        public Builder setMeasurements(java.util.List<MeasurementInputDto> measurements) {
            this.measurements = measurements;
            return this;
        }

        public Builder setTargetUsers(java.util.List<String> targetUsers) {
            this.targetUsers = targetUsers;
            return this;
        }


        public DataCenterInsightDimensionsQueryRequest build() {
            DataCenterInsightDimensionsQueryRequest obj = new DataCenterInsightDimensionsQueryRequest();
            obj.setMeasurements(measurements);
            obj.setTargetUsers(targetUsers);
            return obj;
        }

    }
}
