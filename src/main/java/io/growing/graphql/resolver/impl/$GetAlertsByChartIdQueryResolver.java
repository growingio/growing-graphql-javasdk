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
    date = "2021-05-26T15:01:23+0800"
)
final public class $GetAlertsByChartIdQueryResolver implements GetAlertsByChartIdQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $GetAlertsByChartIdQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $GetAlertsByChartIdQueryResolver() {}

    @Override
    public java.util.List<AnalysisAlertsDto> getAlertsByChartId(String projectId, String chartId) throws Exception {
        GetAlertsByChartIdQueryRequest request = new GetAlertsByChartIdQueryRequest();
        List<String> keys = Arrays.asList("projectId", "chartId");
        List<?> values = Arrays.asList(projectId, chartId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AnalysisAlertsResponseProjection projection = new AnalysisAlertsResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        GetAlertsByChartIdQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, GetAlertsByChartIdQueryResponse.class);
        return result.getAlertsByChartId();
    }

}