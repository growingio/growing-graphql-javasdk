package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createProjectRole in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateProjectRoleParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private RoleInputDto role;

    public MutationCreateProjectRoleParametrizedInput() {
    }

    public MutationCreateProjectRoleParametrizedInput(String projectId, RoleInputDto role) {
        this.projectId = projectId;
        this.role = role;
    }

    public MutationCreateProjectRoleParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateProjectRoleParametrizedInput role(RoleInputDto role) {
        this.role = role;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        return joiner.toString();
    }

}
