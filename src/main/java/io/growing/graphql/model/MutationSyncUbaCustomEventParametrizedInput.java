package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field syncUbaCustomEvent in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class MutationSyncUbaCustomEventParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String tunnelId;
    @javax.validation.constraints.NotNull
    private java.util.List<UbaCustomEventInputDto> ubaCustomEvents;

    public MutationSyncUbaCustomEventParametrizedInput() {
    }

    public MutationSyncUbaCustomEventParametrizedInput(String tunnelId, java.util.List<UbaCustomEventInputDto> ubaCustomEvents) {
        this.tunnelId = tunnelId;
        this.ubaCustomEvents = ubaCustomEvents;
    }

    public MutationSyncUbaCustomEventParametrizedInput tunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }

    public MutationSyncUbaCustomEventParametrizedInput ubaCustomEvents(java.util.List<UbaCustomEventInputDto> ubaCustomEvents) {
        this.ubaCustomEvents = ubaCustomEvents;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tunnelId != null) {
            joiner.add("tunnelId: " + GraphQLRequestSerializer.getEntry(tunnelId));
        }
        if (ubaCustomEvents != null) {
            joiner.add("ubaCustomEvents: " + GraphQLRequestSerializer.getEntry(ubaCustomEvents));
        }
        return joiner.toString();
    }

}
