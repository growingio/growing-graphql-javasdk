package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateRole in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationUpdateRoleParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private RoleInputDto role;

    public MutationUpdateRoleParametrizedInput() {
    }

    public MutationUpdateRoleParametrizedInput(String id, RoleInputDto role) {
        this.id = id;
        this.role = role;
    }

    public MutationUpdateRoleParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateRoleParametrizedInput role(RoleInputDto role) {
        this.role = role;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        return joiner.toString();
    }

}
