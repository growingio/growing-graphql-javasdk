package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field addProjectMembers in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationAddProjectMembersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private AddProjectMembersInputDto input;

    public MutationAddProjectMembersParametrizedInput() {
    }

    public MutationAddProjectMembersParametrizedInput(AddProjectMembersInputDto input) {
        this.input = input;
    }

    public MutationAddProjectMembersParametrizedInput input(AddProjectMembersInputDto input) {
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
