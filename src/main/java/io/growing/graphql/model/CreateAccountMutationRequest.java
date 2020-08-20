package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class CreateAccountMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createAccount";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateAccountMutationRequest() {
    }

    public void setEmail(String email) {
        this.input.put("email", email);
    }

    public void setRoleId(String roleId) {
        this.input.put("roleId", roleId);
    }

    public void setPermissions(java.util.List<String> permissions) {
        this.input.put("permissions", permissions);
    }

    public void setExtra(String extra) {
        this.input.put("extra", extra);
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

        private String email;
        private String roleId;
        private java.util.List<String> permissions;
        private String extra;

        public Builder() {
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setExtra(String extra) {
            this.extra = extra;
            return this;
        }


        public CreateAccountMutationRequest build() {
            CreateAccountMutationRequest obj = new CreateAccountMutationRequest();
            obj.setEmail(email);
            obj.setRoleId(roleId);
            obj.setPermissions(permissions);
            obj.setExtra(extra);
            return obj;
        }

    }
}
