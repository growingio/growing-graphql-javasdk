package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDataCenterEventVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateDataCenterEventVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private VariableInputDto eventVariable;

    public MutationCreateDataCenterEventVariableParametrizedInput() {
    }

    public MutationCreateDataCenterEventVariableParametrizedInput(VariableInputDto eventVariable) {
        this.eventVariable = eventVariable;
    }

    public MutationCreateDataCenterEventVariableParametrizedInput eventVariable(VariableInputDto eventVariable) {
        this.eventVariable = eventVariable;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (eventVariable != null) {
            joiner.add("eventVariable: " + GraphQLRequestSerializer.getEntry(eventVariable));
        }
        return joiner.toString();
    }

}
