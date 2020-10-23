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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultUpdateTunnelMutationResolver implements UpdateTunnelMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateTunnelMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateTunnelMutationResolver() {}

    @Override
    public TunnelDto updateTunnel(String id, TunnelInputDto tunnel) throws Exception {
        UpdateTunnelMutationRequest request = new UpdateTunnelMutationRequest();
        List<String> keys = Arrays.asList("id", "tunnel");
        List<?> values = Arrays.asList(id, tunnel);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TunnelResponseProjection projection = new TunnelResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateTunnelMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateTunnelMutationResponse.class);
        return result.updateTunnel();
    }

}