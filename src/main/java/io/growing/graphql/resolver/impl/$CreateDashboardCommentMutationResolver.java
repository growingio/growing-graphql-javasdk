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
final public class $CreateDashboardCommentMutationResolver implements CreateDashboardCommentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDashboardCommentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDashboardCommentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DashboardCommentDto createDashboardComment(String projectId, DashboardCommentInputDto dashboardComment) throws Exception {
        CreateDashboardCommentMutationRequest request = new CreateDashboardCommentMutationRequest();
        List<String> keys = Arrays.asList("projectId", "dashboardComment");
        List<?> values = Arrays.asList(projectId, dashboardComment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DashboardCommentResponseProjection projection = new DashboardCommentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDashboardCommentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDashboardCommentMutationResponse.class);
        return result.createDashboardComment();
    }

}