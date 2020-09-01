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
public class UpdateRoleMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateRole";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateRoleMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setRole(RoleInputDto role) {
        this.input.put("role", role);
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
        private RoleInputDto role;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setRole(RoleInputDto role) {
            this.role = role;
            return this;
        }


        public UpdateRoleMutationRequest build() {
            UpdateRoleMutationRequest obj = new UpdateRoleMutationRequest();
            obj.setId(id);
            obj.setRole(role);
            return obj;
        }

    }
}
