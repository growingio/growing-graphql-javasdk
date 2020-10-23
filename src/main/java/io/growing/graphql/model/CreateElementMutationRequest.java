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
public class CreateElementMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createElement";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateElementMutationRequest() {
    }

    public void setElement(ElementInputDto element) {
        this.input.put("element", element);
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

        private ElementInputDto element;

        public Builder() {
        }

        public Builder setElement(ElementInputDto element) {
            this.element = element;
            return this;
        }


        public CreateElementMutationRequest build() {
            CreateElementMutationRequest obj = new CreateElementMutationRequest();
            obj.setElement(element);
            return obj;
        }

    }
}
