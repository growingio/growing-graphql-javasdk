package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDataCenterEventVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateDataCenterEventVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private VariableInputDto eventVariable;

    public MutationUpdateDataCenterEventVariableParametrizedInput() {
    }

    public MutationUpdateDataCenterEventVariableParametrizedInput(String id, VariableInputDto eventVariable) {
        this.id = id;
        this.eventVariable = eventVariable;
    }

    public MutationUpdateDataCenterEventVariableParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateDataCenterEventVariableParametrizedInput eventVariable(VariableInputDto eventVariable) {
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
