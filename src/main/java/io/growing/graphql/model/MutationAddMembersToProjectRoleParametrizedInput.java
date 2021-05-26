package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field addMembersToProjectRole in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationAddMembersToProjectRoleParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private AddMembersToProjectRoleInputDto input;

    public MutationAddMembersToProjectRoleParametrizedInput() {
    }

    public MutationAddMembersToProjectRoleParametrizedInput(String projectId, AddMembersToProjectRoleInputDto input) {
        this.projectId = projectId;
        this.input = input;
    }

    public MutationAddMembersToProjectRoleParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationAddMembersToProjectRoleParametrizedInput input(AddMembersToProjectRoleInputDto input) {
        this.input = input;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (input != null) {
            joiner.add("input: " + GraphQLRequestSerializer.getEntry(input));
        }
        return joiner.toString();
    }

}
