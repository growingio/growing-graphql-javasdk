package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field addMembersToDataCenterRole in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationAddMembersToDataCenterRoleParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<String> memberIds;
    @javax.validation.constraints.NotNull
    private String roleId;

    public MutationAddMembersToDataCenterRoleParametrizedInput() {
    }

    public MutationAddMembersToDataCenterRoleParametrizedInput(java.util.List<String> memberIds, String roleId) {
        this.memberIds = memberIds;
        this.roleId = roleId;
    }

    public MutationAddMembersToDataCenterRoleParametrizedInput memberIds(java.util.List<String> memberIds) {
        this.memberIds = memberIds;
        return this;
    }

    public MutationAddMembersToDataCenterRoleParametrizedInput roleId(String roleId) {
        this.roleId = roleId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (memberIds != null) {
            joiner.add("memberIds: " + GraphQLRequestSerializer.getEntry(memberIds));
        }
        if (roleId != null) {
            joiner.add("roleId: " + GraphQLRequestSerializer.getEntry(roleId));
        }
        return joiner.toString();
    }

}
