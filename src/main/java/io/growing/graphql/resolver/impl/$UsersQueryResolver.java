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
final public class $UsersQueryResolver implements UsersQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UsersQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UsersQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SlicePaginationDto users(String projectId, UserQueryTypeDto type, String id, Integer offset, Integer limit, java.util.List<String> tags, java.util.List<String> properties) throws Exception {
        UsersQueryRequest request = new UsersQueryRequest();
        List<String> keys = Arrays.asList("projectId", "type", "id", "offset", "limit", "tags", "properties");
        List<?> values = Arrays.asList(projectId, type, id, offset, limit, tags, properties);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SlicePaginationResponseProjection projection = new SlicePaginationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UsersQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UsersQueryResponse.class);
        return result.users();
    }

}