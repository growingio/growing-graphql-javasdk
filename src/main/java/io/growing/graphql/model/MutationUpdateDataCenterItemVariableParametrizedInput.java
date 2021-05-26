package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDataCenterItemVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateDataCenterItemVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private VariableInputDto itemVariable;

    public MutationUpdateDataCenterItemVariableParametrizedInput() {
    }

    public MutationUpdateDataCenterItemVariableParametrizedInput(String id, VariableInputDto itemVariable) {
        this.id = id;
        this.itemVariable = itemVariable;
    }

    public MutationUpdateDataCenterItemVariableParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateDataCenterItemVariableParametrizedInput itemVariable(VariableInputDto itemVariable) {
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
