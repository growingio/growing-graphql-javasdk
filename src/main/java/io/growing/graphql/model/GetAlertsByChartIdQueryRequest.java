package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class GetAlertsByChartIdQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "getAlertsByChartId";

    private Map<String, Object> input = new LinkedHashMap<>();

    public GetAlertsByChartIdQueryRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setChartId(String chartId) {
        this.input.put("chartId", chartId);
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
        private String chartId;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }


        public GetAlertsByChartIdQueryRequest build() {
            GetAlertsByChartIdQueryRequest obj = new GetAlertsByChartIdQueryRequest();
            obj.setProjectId(projectId);
            obj.setChartId(chartId);
            return obj;
        }

    }
}
