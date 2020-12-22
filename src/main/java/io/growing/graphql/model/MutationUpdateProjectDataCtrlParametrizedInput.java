package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateProjectDataCtrl in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationUpdateProjectDataCtrlParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private UpdateProjectDataCtrlInputDto input;

    public MutationUpdateProjectDataCtrlParametrizedInput() {
    }

    public MutationUpdateProjectDataCtrlParametrizedInput(UpdateProjectDataCtrlInputDto input) {
        this.input = input;
    }

    public MutationUpdateProjectDataCtrlParametrizedInput input(UpdateProjectDataCtrlInputDto input) {
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
