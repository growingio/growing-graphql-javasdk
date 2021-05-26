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
final public class $CountDashboardsQueryResolver implements CountDashboardsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CountDashboardsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CountDashboardsQueryResolver() {}

    @Override
    public Integer countDashboards(String projectId) throws Exception {
        CountDashboardsQueryRequest request = new CountDashboardsQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountDashboardsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountDashboardsQueryResponse.class);
        return result.countDashboards();
    }

}