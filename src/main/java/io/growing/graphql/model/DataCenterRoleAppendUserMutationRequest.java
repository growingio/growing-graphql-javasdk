package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @deprecated
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class DataCenterRoleAppendUserMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "dataCenterRoleAppendUser";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterRoleAppendUserMutationRequest() {
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


        public DataCenterRoleAppendUserMutationRequest build() {
            DataCenterRoleAppendUserMutationRequest obj = new DataCenterRoleAppendUserMutationRequest();
            obj.setRoleName(roleName);
            obj.setUserId(userId);
            return obj;
        }

    }
}
