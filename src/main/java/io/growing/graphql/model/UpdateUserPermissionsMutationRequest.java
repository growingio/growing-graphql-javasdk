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
public class UpdateUserPermissionsMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateUserPermissions";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateUserPermissionsMutationRequest() {
    }

    public void setUserId(String userId) {
        this.input.put("userId", userId);
    }

    public void setRoleId(String roleId) {
        this.input.put("roleId", roleId);
    }

    public void setPermissions(java.util.List<String> permissions) {
        this.input.put("permissions", permissions);
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

        private String userId;
        private String roleId;
        private java.util.List<String> permissions;

        public Builder() {
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
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


        public UpdateUserPermissionsMutationRequest build() {
            UpdateUserPermissionsMutationRequest obj = new UpdateUserPermissionsMutationRequest();
            obj.setUserId(userId);
            obj.setRoleId(roleId);
            obj.setPermissions(permissions);
            return obj;
        }

    }
}
