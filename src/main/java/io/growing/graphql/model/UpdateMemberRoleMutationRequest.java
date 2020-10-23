package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class UpdateMemberRoleMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateMemberRole";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateMemberRoleMutationRequest() {
    }

    public void setMemberId(String memberId) {
        this.input.put("memberId", memberId);
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

        private String memberId;
        private String roleId;

        public Builder() {
        }

        public Builder setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }


        public UpdateMemberRoleMutationRequest build() {
            UpdateMemberRoleMutationRequest obj = new UpdateMemberRoleMutationRequest();
            obj.setMemberId(memberId);
            obj.setRoleId(roleId);
            return obj;
        }

    }
}
