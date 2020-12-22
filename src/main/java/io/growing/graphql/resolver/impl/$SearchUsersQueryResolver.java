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

/**
 * 查询用户，properties为返回哪些用户信息/属性，filter为需要的过滤字段，之前的q现在使用filter传
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $SearchUsersQueryResolver implements SearchUsersQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $SearchUsersQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SearchUsersQueryResolver() {}

    /**
     * 查询用户，properties为返回哪些用户信息/属性，filter为需要的过滤字段，之前的q现在使用filter传
     */
    @Override
    public java.util.List<UserSearchDto> searchUsers(String projectId, java.util.List<String> properties, FilterInputDto filter) throws Exception {
        SearchUsersQueryRequest request = new SearchUsersQueryRequest();
        List<String> keys = Arrays.asList("projectId", "properties", "filter");
        List<?> values = Arrays.asList(projectId, properties, filter);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserSearchResponseProjection projection = new UserSearchResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SearchUsersQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SearchUsersQueryResponse.class);
        return result.searchUsers();
    }

}