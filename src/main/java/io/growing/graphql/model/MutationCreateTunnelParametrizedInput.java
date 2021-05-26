package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createTunnel in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateTunnelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private TunnelInputDto tunnel;

    public MutationCreateTunnelParametrizedInput() {
    }

    public MutationCreateTunnelParametrizedInput(TunnelInputDto tunnel) {
        this.tunnel = tunnel;
    }

    public MutationCreateTunnelParametrizedInput tunnel(TunnelInputDto tunnel) {
        this.tunnel = tunnel;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tunnel != null) {
            joiner.add("tunnel: " + GraphQLRequestSerializer.getEntry(tunnel));
        }
        return joiner.toString();
    }

}
