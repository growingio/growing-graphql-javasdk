package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDataCenterItemVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateDataCenterItemVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private VariableInputDto itemVariable;

    public MutationCreateDataCenterItemVariableParametrizedInput() {
    }

    public MutationCreateDataCenterItemVariableParametrizedInput(VariableInputDto itemVariable) {
        this.itemVariable = itemVariable;
    }

    public MutationCreateDataCenterItemVariableParametrizedInput itemVariable(VariableInputDto itemVariable) {
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
