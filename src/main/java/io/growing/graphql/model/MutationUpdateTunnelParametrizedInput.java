package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateTunnel in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationUpdateTunnelParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private TunnelInputDto tunnel;

    public MutationUpdateTunnelParametrizedInput() {
    }

    public MutationUpdateTunnelParametrizedInput(String id, TunnelInputDto tunnel) {
        this.id = id;
        this.tunnel = tunnel;
    }

    public MutationUpdateTunnelParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateTunnelParametrizedInput tunnel(TunnelInputDto tunnel) {
        this.tunnel = tunnel;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (tunnel != null) {
            joiner.add("tunnel: " + GraphQLRequestSerializer.getEntry(tunnel));
        }
        return joiner.toString();
    }

}
