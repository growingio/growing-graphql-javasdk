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
final public class DefaultFrequencyAnalysisQueryResolver implements FrequencyAnalysisQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultFrequencyAnalysisQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultFrequencyAnalysisQueryResolver() {}

    @Override
    public FrequencyAnalysisDto frequencyAnalysis(String id, String dashboardId) throws Exception {
        FrequencyAnalysisQueryRequest request = new FrequencyAnalysisQueryRequest();
        List<String> keys = Arrays.asList("id", "dashboardId");
        List<?> values = Arrays.asList(id, dashboardId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FrequencyAnalysisResponseProjection projection = new FrequencyAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        FrequencyAnalysisQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, FrequencyAnalysisQueryResponse.class);
        return result.frequencyAnalysis();
    }

}