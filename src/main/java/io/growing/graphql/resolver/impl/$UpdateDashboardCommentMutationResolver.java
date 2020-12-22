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
final public class $UpdateDashboardCommentMutationResolver implements UpdateDashboardCommentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDashboardCommentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDashboardCommentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DashboardCommentDto updateDashboardComment(String projectId, String id, DashboardCommentInputDto dashboardComment) throws Exception {
        UpdateDashboardCommentMutationRequest request = new UpdateDashboardCommentMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "dashboardComment");
        List<?> values = Arrays.asList(projectId, id, dashboardComment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DashboardCommentResponseProjection projection = new DashboardCommentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateDashboardCommentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDashboardCommentMutationResponse.class);
        return result.updateDashboardComment();
    }

}