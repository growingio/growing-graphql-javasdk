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
final public class $EventAnalysisQueryResolver implements EventAnalysisQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $EventAnalysisQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $EventAnalysisQueryResolver() {}

    @Override
    public EventAnalysisDto eventAnalysis(String projectId, String id, String dashboardId) throws Exception {
        EventAnalysisQueryRequest request = new EventAnalysisQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id", "dashboardId");
        List<?> values = Arrays.asList(projectId, id, dashboardId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventAnalysisResponseProjection projection = new EventAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        EventAnalysisQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, EventAnalysisQueryResponse.class);
        return result.eventAnalysis();
    }

}