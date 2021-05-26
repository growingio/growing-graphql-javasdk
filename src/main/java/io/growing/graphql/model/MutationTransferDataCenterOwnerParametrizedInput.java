package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field transferDataCenterOwner in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationTransferDataCenterOwnerParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String transfereeId;

    public MutationTransferDataCenterOwnerParametrizedInput() {
    }

    public MutationTransferDataCenterOwnerParametrizedInput(String transfereeId) {
        this.transfereeId = transfereeId;
    }

    public MutationTransferDataCenterOwnerParametrizedInput transfereeId(String transfereeId) {
        this.transfereeId = transfereeId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (transfereeId != null) {
            joiner.add("transfereeId: " + GraphQLRequestSerializer.getEntry(transfereeId));
        }
        return joiner.toString();
    }

}
