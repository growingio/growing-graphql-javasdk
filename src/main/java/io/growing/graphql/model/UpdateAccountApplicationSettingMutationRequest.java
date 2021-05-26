package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateAccountApplicationSettingMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateAccountApplicationSetting";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateAccountApplicationSettingMutationRequest() {
    }

    public void setInput(AccountApplicationSettingInputDto input) {
        this.input.put("input", input);
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

        private AccountApplicationSettingInputDto input;

        public Builder() {
        }

        public Builder setInput(AccountApplicationSettingInputDto input) {
            this.input = input;
            return this;
        }


        public UpdateAccountApplicationSettingMutationRequest build() {
            UpdateAccountApplicationSettingMutationRequest obj = new UpdateAccountApplicationSettingMutationRequest();
            obj.setInput(input);
            return obj;
        }

    }
}
