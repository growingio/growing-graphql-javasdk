package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field syncUbaUserVariable in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationSyncUbaUserVariableParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String tunnelId;
    @javax.validation.constraints.NotNull
    private java.util.List<UbaUserVariableInputDto> ubaUserVariables;

    public MutationSyncUbaUserVariableParametrizedInput() {
    }

    public MutationSyncUbaUserVariableParametrizedInput(String tunnelId, java.util.List<UbaUserVariableInputDto> ubaUserVariables) {
        this.tunnelId = tunnelId;
        this.ubaUserVariables = ubaUserVariables;
    }

    public MutationSyncUbaUserVariableParametrizedInput tunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }

    public MutationSyncUbaUserVariableParametrizedInput ubaUserVariables(java.util.List<UbaUserVariableInputDto> ubaUserVariables) {
        this.ubaUserVariables = ubaUserVariables;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tunnelId != null) {
            joiner.add("tunnelId: " + GraphQLRequestSerializer.getEntry(tunnelId));
        }
        if (ubaUserVariables != null) {
            joiner.add("ubaUserVariables: " + GraphQLRequestSerializer.getEntry(ubaUserVariables));
        }
        return joiner.toString();
    }

}
