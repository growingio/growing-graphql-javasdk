package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class CreateComplexMetricMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createComplexMetric";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateComplexMetricMutationRequest() {
    }

    public void setComplexMetric(ComplexMetricInputDto complexMetric) {
        this.input.put("complexMetric", complexMetric);
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

        private ComplexMetricInputDto complexMetric;

        public Builder() {
        }

        public Builder setComplexMetric(ComplexMetricInputDto complexMetric) {
            this.complexMetric = complexMetric;
            return this;
        }


        public CreateComplexMetricMutationRequest build() {
            CreateComplexMetricMutationRequest obj = new CreateComplexMetricMutationRequest();
            obj.setComplexMetric(complexMetric);
            return obj;
        }

    }
}
