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
public class UpdateComplexMetricMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateComplexMetric";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateComplexMetricMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
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

        private String id;
        private ComplexMetricInputDto complexMetric;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setComplexMetric(ComplexMetricInputDto complexMetric) {
            this.complexMetric = complexMetric;
            return this;
        }


        public UpdateComplexMetricMutationRequest build() {
            UpdateComplexMetricMutationRequest obj = new UpdateComplexMetricMutationRequest();
            obj.setId(id);
            obj.setComplexMetric(complexMetric);
            return obj;
        }

    }
}
