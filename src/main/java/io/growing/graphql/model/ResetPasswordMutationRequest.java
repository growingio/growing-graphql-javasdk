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
public class ResetPasswordMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "resetPassword";

    private Map<String, Object> input = new LinkedHashMap<>();

    public ResetPasswordMutationRequest() {
    }

    public void setInput(ResetPasswordInputDto input) {
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

        private ResetPasswordInputDto input;

        public Builder() {
        }

        public Builder setInput(ResetPasswordInputDto input) {
            this.input = input;
            return this;
        }


        public ResetPasswordMutationRequest build() {
            ResetPasswordMutationRequest obj = new ResetPasswordMutationRequest();
            obj.setInput(input);
            return obj;
        }

    }
}
