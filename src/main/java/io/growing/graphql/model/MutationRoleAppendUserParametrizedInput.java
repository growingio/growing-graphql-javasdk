package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field roleAppendUser in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationRoleAppendUserParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String roleName;
    @javax.validation.constraints.NotNull
    private String userId;

    public MutationRoleAppendUserParametrizedInput() {
    }

    public MutationRoleAppendUserParametrizedInput(String roleName, String userId) {
        this.roleName = roleName;
        this.userId = userId;
    }

    public MutationRoleAppendUserParametrizedInput roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public MutationRoleAppendUserParametrizedInput userId(String userId) {
        this.userId = userId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (roleName != null) {
            joiner.add("roleName: " + GraphQLRequestSerializer.getEntry(roleName));
        }
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        return joiner.toString();
    }

}
