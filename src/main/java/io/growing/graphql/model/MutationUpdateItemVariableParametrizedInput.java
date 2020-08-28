package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateItemVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class MutationUpdateItemVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private VariableInputDto itemVariable;

    public MutationUpdateItemVariableParametrizedInput() {
    }

    public MutationUpdateItemVariableParametrizedInput(String id, VariableInputDto itemVariable) {
        this.id = id;
        this.itemVariable = itemVariable;
    }

    public MutationUpdateItemVariableParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateItemVariableParametrizedInput itemVariable(VariableInputDto itemVariable) {
        this.itemVariable = itemVariable;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (itemVariable != null) {
            joiner.add("itemVariable: " + GraphQLRequestSerializer.getEntry(itemVariable));
        }
        return joiner.toString();
    }

}
