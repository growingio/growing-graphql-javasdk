package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateMemberDataCenterRole in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationUpdateMemberDataCenterRoleParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String memberId;
    @javax.validation.constraints.NotNull
    private String roleId;

    public MutationUpdateMemberDataCenterRoleParametrizedInput() {
    }

    public MutationUpdateMemberDataCenterRoleParametrizedInput(String memberId, String roleId) {
        this.memberId = memberId;
        this.roleId = roleId;
    }

    public MutationUpdateMemberDataCenterRoleParametrizedInput memberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public MutationUpdateMemberDataCenterRoleParametrizedInput roleId(String roleId) {
        this.roleId = roleId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (memberId != null) {
            joiner.add("memberId: " + GraphQLRequestSerializer.getEntry(memberId));
        }
        if (roleId != null) {
            joiner.add("roleId: " + GraphQLRequestSerializer.getEntry(roleId));
        }
        return joiner.toString();
    }

}
