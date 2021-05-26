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
final public class $ActiveUsersQueryResolver implements ActiveUsersQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $ActiveUsersQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ActiveUsersQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SlicePaginationDto activeUsers(String projectId, String timeRange, Integer offset, Integer limit) throws Exception {
        ActiveUsersQueryRequest request = new ActiveUsersQueryRequest();
        List<String> keys = Arrays.asList("projectId", "timeRange", "offset", "limit");
        List<?> values = Arrays.asList(projectId, timeRange, offset, limit);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SlicePaginationResponseProjection projection = new SlicePaginationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ActiveUsersQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ActiveUsersQueryResponse.class);
        return result.activeUsers();
    }

}