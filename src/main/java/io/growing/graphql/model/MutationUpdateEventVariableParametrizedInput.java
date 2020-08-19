package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateEventVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationUpdateEventVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private VariableInputDto eventVariable;

    public MutationUpdateEventVariableParametrizedInput() {
    }

    public MutationUpdateEventVariableParametrizedInput(String id, VariableInputDto eventVariable) {
        this.id = id;
        this.eventVariable = eventVariable;
    }

    public MutationUpdateEventVariableParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateEventVariableParametrizedInput eventVariable(VariableInputDto eventVariable) {
        this.eventVariable = eventVariable;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (eventVariable != null) {
            joiner.add("eventVariable: " + GraphQLRequestSerializer.getEntry(eventVariable));
        }
        return joiner.toString();
    }

}
