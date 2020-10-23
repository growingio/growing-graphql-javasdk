package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateUserVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationUpdateUserVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private VariableInputDto userVariable;

    public MutationUpdateUserVariableParametrizedInput() {
    }

    public MutationUpdateUserVariableParametrizedInput(String id, VariableInputDto userVariable) {
        this.id = id;
        this.userVariable = userVariable;
    }

    public MutationUpdateUserVariableParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateUserVariableParametrizedInput userVariable(VariableInputDto userVariable) {
        this.userVariable = userVariable;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (userVariable != null) {
            joiner.add("userVariable: " + GraphQLRequestSerializer.getEntry(userVariable));
        }
        return joiner.toString();
    }

}
