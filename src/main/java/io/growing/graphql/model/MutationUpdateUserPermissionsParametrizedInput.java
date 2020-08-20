package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateUserPermissions in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationUpdateUserPermissionsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String userId;
    @javax.validation.constraints.NotNull
    private String roleId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> permissions;

    public MutationUpdateUserPermissionsParametrizedInput() {
    }

    public MutationUpdateUserPermissionsParametrizedInput(String userId, String roleId, java.util.List<String> permissions) {
        this.userId = userId;
        this.roleId = roleId;
        this.permissions = permissions;
    }

    public MutationUpdateUserPermissionsParametrizedInput userId(String userId) {
        this.userId = userId;
        return this;
    }

    public MutationUpdateUserPermissionsParametrizedInput roleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    public MutationUpdateUserPermissionsParametrizedInput permissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        if (roleId != null) {
            joiner.add("roleId: " + GraphQLRequestSerializer.getEntry(roleId));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        return joiner.toString();
    }

}
