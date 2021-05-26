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
public class CreateDataCenterRoleMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createDataCenterRole";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateDataCenterRoleMutationRequest() {
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

        private RoleInputDto role;

        public Builder() {
        }

        public Builder setRole(RoleInputDto role) {
            this.role = role;
            return this;
        }


        public CreateDataCenterRoleMutationRequest build() {
            CreateDataCenterRoleMutationRequest obj = new CreateDataCenterRoleMutationRequest();
            obj.setRole(role);
            return obj;
        }

    }
}
