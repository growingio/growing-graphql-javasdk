package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public interface CreateTunnelMutationResolver {

    @javax.validation.constraints.NotNull
    TunnelDto createTunnel(TunnelInputDto tunnel) throws Exception;

}