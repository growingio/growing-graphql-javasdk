package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createItemVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationCreateItemVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private VariableInputDto itemVariable;

    public MutationCreateItemVariableParametrizedInput() {
    }

    public MutationCreateItemVariableParametrizedInput(VariableInputDto itemVariable) {
        this.itemVariable = itemVariable;
    }

    public MutationCreateItemVariableParametrizedInput itemVariable(VariableInputDto itemVariable) {
        this.itemVariable = itemVariable;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (itemVariable != null) {
            joiner.add("itemVariable: " + GraphQLRequestSerializer.getEntry(itemVariable));
        }
        return joiner.toString();
    }

}
