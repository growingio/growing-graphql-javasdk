package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDataCenterRole in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateDataCenterRoleParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private RoleInputDto role;

    public MutationCreateDataCenterRoleParametrizedInput() {
    }

    public MutationCreateDataCenterRoleParametrizedInput(RoleInputDto role) {
        this.role = role;
    }

    public MutationCreateDataCenterRoleParametrizedInput role(RoleInputDto role) {
        this.role = role;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        return joiner.toString();
    }

}
