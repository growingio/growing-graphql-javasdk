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
final public class DefaultFunnelAnalysisQueryResolver implements FunnelAnalysisQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultFunnelAnalysisQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultFunnelAnalysisQueryResolver() {}

    @Override
    public FunnelAnalysisDto funnelAnalysis(String id, String dashboardId) throws Exception {
        FunnelAnalysisQueryRequest request = new FunnelAnalysisQueryRequest();
        List<String> keys = Arrays.asList("id", "dashboardId");
        List<?> values = Arrays.asList(id, dashboardId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FunnelAnalysisResponseProjection projection = new FunnelAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        FunnelAnalysisQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, FunnelAnalysisQueryResponse.class);
        return result.funnelAnalysis();
    }

}