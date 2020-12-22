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
public class PasswordValidationQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "passwordValidation";

    private Map<String, Object> input = new LinkedHashMap<>();

    public PasswordValidationQueryRequest() {
    }

    public void setIdentity(String identity) {
        this.input.put("identity", identity);
    }

    public void setPassword(String password) {
        this.input.put("password", password);
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

        private String identity;
        private String password;

        public Builder() {
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }


        public PasswordValidationQueryRequest build() {
            PasswordValidationQueryRequest obj = new PasswordValidationQueryRequest();
            obj.setIdentity(identity);
            obj.setPassword(password);
            return obj;
        }

    }
}
