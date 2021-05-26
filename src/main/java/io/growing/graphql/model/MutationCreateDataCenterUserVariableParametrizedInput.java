package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDataCenterUserVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateDataCenterUserVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private VariableInputDto userVariable;

    public MutationCreateDataCenterUserVariableParametrizedInput() {
    }

    public MutationCreateDataCenterUserVariableParametrizedInput(VariableInputDto userVariable) {
        this.userVariable = userVariable;
    }

    public MutationCreateDataCenterUserVariableParametrizedInput userVariable(VariableInputDto userVariable) {
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
