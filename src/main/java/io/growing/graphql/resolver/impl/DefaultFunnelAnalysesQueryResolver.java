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
final public class DefaultFunnelAnalysesQueryResolver implements FunnelAnalysesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultFunnelAnalysesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultFunnelAnalysesQueryResolver() {}

    @Override
    public java.util.List<FunnelAnalysisDto> funnelAnalyses() throws Exception {
        FunnelAnalysesQueryRequest request = new FunnelAnalysesQueryRequest();
        FunnelAnalysisResponseProjection projection = new FunnelAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        FunnelAnalysesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, FunnelAnalysesQueryResponse.class);
        return result.funnelAnalyses();
    }

}