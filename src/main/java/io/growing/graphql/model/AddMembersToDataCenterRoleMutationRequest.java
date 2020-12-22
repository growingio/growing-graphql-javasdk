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
public class AddMembersToDataCenterRoleMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "addMembersToDataCenterRole";

    private Map<String, Object> input = new LinkedHashMap<>();

    public AddMembersToDataCenterRoleMutationRequest() {
    }

    public void setMemberIds(java.util.List<String> memberIds) {
        this.input.put("memberIds", memberIds);
    }

    public void setRoleId(String roleId) {
        this.input.put("roleId", roleId);
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

        private java.util.List<String> memberIds;
        private String roleId;

        public Builder() {
        }

        public Builder setMemberIds(java.util.List<String> memberIds) {
            this.memberIds = memberIds;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }


        public AddMembersToDataCenterRoleMutationRequest build() {
            AddMembersToDataCenterRoleMutationRequest obj = new AddMembersToDataCenterRoleMutationRequest();
            obj.setMemberIds(memberIds);
            obj.setRoleId(roleId);
            return obj;
        }

    }
}
