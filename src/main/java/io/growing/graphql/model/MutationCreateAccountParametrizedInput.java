package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createAccount in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateAccountParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String roleId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> permissions;
    private String extra;

    public MutationCreateAccountParametrizedInput() {
    }

    public MutationCreateAccountParametrizedInput(String email, String roleId, java.util.List<String> permissions, String extra) {
        this.email = email;
        this.roleId = roleId;
        this.permissions = permissions;
        this.extra = extra;
    }

    public MutationCreateAccountParametrizedInput email(String email) {
        this.email = email;
        return this;
    }

    public MutationCreateAccountParametrizedInput roleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    public MutationCreateAccountParametrizedInput permissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public MutationCreateAccountParametrizedInput extra(String extra) {
        this.extra = extra;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (roleId != null) {
            joiner.add("roleId: " + GraphQLRequestSerializer.getEntry(roleId));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        if (extra != null) {
            joiner.add("extra: " + GraphQLRequestSerializer.getEntry(extra));
        }
        return joiner.toString();
    }

}
