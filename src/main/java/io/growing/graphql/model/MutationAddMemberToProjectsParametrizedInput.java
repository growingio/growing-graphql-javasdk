package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field addMemberToProjects in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationAddMemberToProjectsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<AddMemberToProjectInputDto> input;

    public MutationAddMemberToProjectsParametrizedInput() {
    }

    public MutationAddMemberToProjectsParametrizedInput(java.util.List<AddMemberToProjectInputDto> input) {
        this.input = input;
    }

    public MutationAddMemberToProjectsParametrizedInput input(java.util.List<AddMemberToProjectInputDto> input) {
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
