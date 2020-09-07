package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createUserVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationCreateUserVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private VariableInputDto userVariable;

    public MutationCreateUserVariableParametrizedInput() {
    }

    public MutationCreateUserVariableParametrizedInput(VariableInputDto userVariable) {
        this.userVariable = userVariable;
    }

    public MutationCreateUserVariableParametrizedInput userVariable(VariableInputDto userVariable) {
        this.userVariable = userVariable;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (userVariable != null) {
            joiner.add("userVariable: " + GraphQLRequestSerializer.getEntry(userVariable));
        }
        return joiner.toString();
    }

}
