package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据中心 更新物品变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateDataCenterItemVariableMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateDataCenterItemVariable";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateDataCenterItemVariableMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
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

        private String id;
        private VariableInputDto itemVariable;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setItemVariable(VariableInputDto itemVariable) {
            this.itemVariable = itemVariable;
            return this;
        }


        public UpdateDataCenterItemVariableMutationRequest build() {
            UpdateDataCenterItemVariableMutationRequest obj = new UpdateDataCenterItemVariableMutationRequest();
            obj.setId(id);
            obj.setItemVariable(itemVariable);
            return obj;
        }

    }
}
