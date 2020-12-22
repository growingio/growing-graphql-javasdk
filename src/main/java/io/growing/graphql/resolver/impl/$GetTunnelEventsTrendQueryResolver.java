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
    date = "2020-12-22T15:45:58+0800"
)
final public class $GetTunnelEventsTrendQueryResolver implements GetTunnelEventsTrendQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $GetTunnelEventsTrendQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $GetTunnelEventsTrendQueryResolver() {}

    @Override
    public TunnelEventsTrendDto getTunnelEventsTrend(String id) throws Exception {
        GetTunnelEventsTrendQueryRequest request = new GetTunnelEventsTrendQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TunnelEventsTrendResponseProjection projection = new TunnelEventsTrendResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        GetTunnelEventsTrendQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, GetTunnelEventsTrendQueryResponse.class);
        return result.getTunnelEventsTrend();
    }

}