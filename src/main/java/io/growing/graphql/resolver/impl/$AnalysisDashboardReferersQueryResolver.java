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
final public class $AnalysisDashboardReferersQueryResolver implements AnalysisDashboardReferersQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $AnalysisDashboardReferersQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AnalysisDashboardReferersQueryResolver() {}

    @Override
    public java.util.List<DashboardReferenceDto> analysisDashboardReferers(String projectId, String resourceType, String resourceId) throws Exception {
        AnalysisDashboardReferersQueryRequest request = new AnalysisDashboardReferersQueryRequest();
        List<String> keys = Arrays.asList("projectId", "resourceType", "resourceId");
        List<?> values = Arrays.asList(projectId, resourceType, resourceId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DashboardReferenceResponseProjection projection = new DashboardReferenceResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        AnalysisDashboardReferersQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AnalysisDashboardReferersQueryResponse.class);
        return result.analysisDashboardReferers();
    }

}