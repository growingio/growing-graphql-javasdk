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
final public class $KpiAnalysisQueryResolver implements KpiAnalysisQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $KpiAnalysisQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $KpiAnalysisQueryResolver() {}

    @Override
    public KpiAnalysisDto kpiAnalysis(String projectId, String id, String dashboardId) throws Exception {
        KpiAnalysisQueryRequest request = new KpiAnalysisQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id", "dashboardId");
        List<?> values = Arrays.asList(projectId, id, dashboardId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        KpiAnalysisResponseProjection projection = new KpiAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        KpiAnalysisQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, KpiAnalysisQueryResponse.class);
        return result.kpiAnalysis();
    }

}