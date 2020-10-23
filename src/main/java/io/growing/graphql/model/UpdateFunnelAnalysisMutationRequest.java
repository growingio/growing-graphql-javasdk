package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class UpdateFunnelAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateFunnelAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateFunnelAnalysisMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setFunnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) {
        this.input.put("funnelAnalysis", funnelAnalysis);
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
        private FunnelAnalysisInputDto funnelAnalysis;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFunnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) {
            this.funnelAnalysis = funnelAnalysis;
            return this;
        }


        public UpdateFunnelAnalysisMutationRequest build() {
            UpdateFunnelAnalysisMutationRequest obj = new UpdateFunnelAnalysisMutationRequest();
            obj.setId(id);
            obj.setFunnelAnalysis(funnelAnalysis);
            return obj;
        }

    }
}
