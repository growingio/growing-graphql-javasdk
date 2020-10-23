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
final public class DefaultActiveUsersQueryResolver implements ActiveUsersQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultActiveUsersQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultActiveUsersQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SlicePaginationDto activeUsers(String timeRange, Integer offset, Integer limit) throws Exception {
        ActiveUsersQueryRequest request = new ActiveUsersQueryRequest();
        List<String> keys = Arrays.asList("timeRange", "offset", "limit");
        List<?> values = Arrays.asList(timeRange, offset, limit);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SlicePaginationResponseProjection projection = new SlicePaginationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ActiveUsersQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ActiveUsersQueryResponse.class);
        return result.activeUsers();
    }

}