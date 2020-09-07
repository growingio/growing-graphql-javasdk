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
public class CreateItemVariableMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createItemVariable";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateItemVariableMutationRequest() {
    }

    public void setItemVariable(VariableInputDto itemVariable) {
        this.input.put("itemVariable", itemVariable);
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

        private VariableInputDto itemVariable;

        public Builder() {
        }

        public Builder setItemVariable(VariableInputDto itemVariable) {
            this.itemVariable = itemVariable;
            return this;
        }


        public CreateItemVariableMutationRequest build() {
            CreateItemVariableMutationRequest obj = new CreateItemVariableMutationRequest();
            obj.setItemVariable(itemVariable);
            return obj;
        }

    }
}
