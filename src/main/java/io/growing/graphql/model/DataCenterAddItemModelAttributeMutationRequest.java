package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterAddItemModelAttributeMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "dataCenterAddItemModelAttribute";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterAddItemModelAttributeMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setAttribute(ItemVariableInputDto attribute) {
        this.input.put("attribute", attribute);
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
        private ItemVariableInputDto attribute;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAttribute(ItemVariableInputDto attribute) {
            this.attribute = attribute;
            return this;
        }


        public DataCenterAddItemModelAttributeMutationRequest build() {
            DataCenterAddItemModelAttributeMutationRequest obj = new DataCenterAddItemModelAttributeMutationRequest();
            obj.setId(id);
            obj.setAttribute(attribute);
            return obj;
        }

    }
}
