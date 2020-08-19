package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateMemberRole in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationUpdateMemberRoleParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String memberId;
    @javax.validation.constraints.NotNull
    private String roleId;

    public MutationUpdateMemberRoleParametrizedInput() {
    }

    public MutationUpdateMemberRoleParametrizedInput(String memberId, String roleId) {
        this.memberId = memberId;
        this.roleId = roleId;
    }

    public MutationUpdateMemberRoleParametrizedInput memberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public MutationUpdateMemberRoleParametrizedInput roleId(String roleId) {
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
