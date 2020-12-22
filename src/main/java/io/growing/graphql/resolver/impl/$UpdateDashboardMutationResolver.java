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
final public class $UpdateDashboardMutationResolver implements UpdateDashboardMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDashboardMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDashboardMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DashboardDto updateDashboard(String projectId, String id, DashboardInputDto dashboard) throws Exception {
        UpdateDashboardMutationRequest request = new UpdateDashboardMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "dashboard");
        List<?> values = Arrays.asList(projectId, id, dashboard);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DashboardResponseProjection projection = new DashboardResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateDashboardMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDashboardMutationResponse.class);
        return result.updateDashboard();
    }

}