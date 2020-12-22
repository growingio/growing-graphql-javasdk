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
final public class $RetentionAnalysisQueryResolver implements RetentionAnalysisQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $RetentionAnalysisQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $RetentionAnalysisQueryResolver() {}

    @Override
    public RetentionAnalysisDto retentionAnalysis(String projectId, String id, String dashboardId) throws Exception {
        RetentionAnalysisQueryRequest request = new RetentionAnalysisQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id", "dashboardId");
        List<?> values = Arrays.asList(projectId, id, dashboardId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        RetentionAnalysisResponseProjection projection = new RetentionAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        RetentionAnalysisQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, RetentionAnalysisQueryResponse.class);
        return result.retentionAnalysis();
    }

}