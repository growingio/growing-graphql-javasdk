package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field removeProjectMembers in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationRemoveProjectMembersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private RemoveProjectMembersInputDto input;

    public MutationRemoveProjectMembersParametrizedInput() {
    }

    public MutationRemoveProjectMembersParametrizedInput(RemoveProjectMembersInputDto input) {
        this.input = input;
    }

    public MutationRemoveProjectMembersParametrizedInput input(RemoveProjectMembersInputDto input) {
        this.input = input;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (input != null) {
            joiner.add("input: " + GraphQLRequestSerializer.getEntry(input));
        }
        return joiner.toString();
    }

}
