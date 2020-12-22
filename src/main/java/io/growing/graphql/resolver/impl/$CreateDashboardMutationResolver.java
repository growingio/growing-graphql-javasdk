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
final public class $CreateDashboardMutationResolver implements CreateDashboardMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDashboardMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDashboardMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DashboardDto createDashboard(String projectId, DashboardInputDto dashboard) throws Exception {
        CreateDashboardMutationRequest request = new CreateDashboardMutationRequest();
        List<String> keys = Arrays.asList("projectId", "dashboard");
        List<?> values = Arrays.asList(projectId, dashboard);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DashboardResponseProjection projection = new DashboardResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDashboardMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDashboardMutationResponse.class);
        return result.createDashboard();
    }

}