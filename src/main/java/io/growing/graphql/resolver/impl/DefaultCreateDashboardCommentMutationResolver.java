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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultCreateDashboardCommentMutationResolver implements CreateDashboardCommentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateDashboardCommentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateDashboardCommentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DashboardCommentDto createDashboardComment(DashboardCommentInputDto dashboardComment) throws Exception {
        CreateDashboardCommentMutationRequest request = new CreateDashboardCommentMutationRequest();
        List<String> keys = Arrays.asList("dashboardComment");
        List<?> values = Arrays.asList(dashboardComment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DashboardCommentResponseProjection projection = new DashboardCommentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDashboardCommentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDashboardCommentMutationResponse.class);
        return result.createDashboardComment();
    }

}