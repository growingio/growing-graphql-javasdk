package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class FunnelAnalysisQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "funnelAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public FunnelAnalysisQueryRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setDashboardId(String dashboardId) {
        this.input.put("dashboardId", dashboardId);
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

        private String id;
        private String dashboardId;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            return this;
        }


        public FunnelAnalysisQueryRequest build() {
            FunnelAnalysisQueryRequest obj = new FunnelAnalysisQueryRequest();
            obj.setId(id);
            obj.setDashboardId(dashboardId);
            return obj;
        }

    }
}
