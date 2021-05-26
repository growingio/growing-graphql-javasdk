package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field removeProjectMembers in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationRemoveProjectMembersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private RemoveProjectMembersInputDto input;

    public MutationRemoveProjectMembersParametrizedInput() {
    }

    public MutationRemoveProjectMembersParametrizedInput(String projectId, RemoveProjectMembersInputDto input) {
        this.projectId = projectId;
        this.input = input;
    }

    public MutationRemoveProjectMembersParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationRemoveProjectMembersParametrizedInput input(RemoveProjectMembersInputDto input) {
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
