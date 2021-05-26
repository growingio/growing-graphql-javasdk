package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateTunnelMutationResolver implements CreateTunnelMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateTunnelMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateTunnelMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public TunnelDto createTunnel(TunnelInputDto tunnel) throws Exception {
        CreateTunnelMutationRequest request = new CreateTunnelMutationRequest();
        List<String> keys = Arrays.asList("tunnel");
        List<?> values = Arrays.asList(tunnel);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TunnelResponseProjection projection = new TunnelResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateTunnelMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateTunnelMutationResponse.class);
        return result.createTunnel();
    }

}