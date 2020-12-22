package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDataCenterUserVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationUpdateDataCenterUserVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private VariableInputDto userVariable;

    public MutationUpdateDataCenterUserVariableParametrizedInput() {
    }

    public MutationUpdateDataCenterUserVariableParametrizedInput(String id, VariableInputDto userVariable) {
        this.id = id;
        this.userVariable = userVariable;
    }

    public MutationUpdateDataCenterUserVariableParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateDataCenterUserVariableParametrizedInput userVariable(VariableInputDto userVariable) {
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
