package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class CreateFunnelAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createFunnelAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateFunnelAnalysisMutationRequest() {
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

        private FunnelAnalysisInputDto funnelAnalysis;

        public Builder() {
        }

        public Builder setFunnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) {
            this.funnelAnalysis = funnelAnalysis;
            return this;
        }


        public CreateFunnelAnalysisMutationRequest build() {
            CreateFunnelAnalysisMutationRequest obj = new CreateFunnelAnalysisMutationRequest();
            obj.setFunnelAnalysis(funnelAnalysis);
            return obj;
        }

    }
}
