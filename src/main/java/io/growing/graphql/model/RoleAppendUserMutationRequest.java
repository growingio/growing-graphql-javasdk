package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class RoleAppendUserMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "roleAppendUser";

    private Map<String, Object> input = new LinkedHashMap<>();

    public RoleAppendUserMutationRequest() {
    }

    public void setRoleName(String roleName) {
        this.input.put("roleName", roleName);
    }

    public void setUserId(String userId) {
        this.input.put("userId", userId);
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

        private String roleName;
        private String userId;

        public Builder() {
        }

        public Builder setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }


        public RoleAppendUserMutationRequest build() {
            RoleAppendUserMutationRequest obj = new RoleAppendUserMutationRequest();
            obj.setRoleName(roleName);
            obj.setUserId(userId);
            return obj;
        }

    }
}
