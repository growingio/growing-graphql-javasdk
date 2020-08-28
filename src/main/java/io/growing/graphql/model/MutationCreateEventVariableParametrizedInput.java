package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createEventVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class MutationCreateEventVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private VariableInputDto eventVariable;

    public MutationCreateEventVariableParametrizedInput() {
    }

    public MutationCreateEventVariableParametrizedInput(VariableInputDto eventVariable) {
        this.eventVariable = eventVariable;
    }

    public MutationCreateEventVariableParametrizedInput eventVariable(VariableInputDto eventVariable) {
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
