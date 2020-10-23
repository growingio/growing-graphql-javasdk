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
final public class DefaultSearchUsersQueryResolver implements SearchUsersQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSearchUsersQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSearchUsersQueryResolver() {}

    @Override
    public java.util.List<UserSearchDto> searchUsers(String q) throws Exception {
        SearchUsersQueryRequest request = new SearchUsersQueryRequest();
        List<String> keys = Arrays.asList("q");
        List<?> values = Arrays.asList(q);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserSearchResponseProjection projection = new UserSearchResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SearchUsersQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SearchUsersQueryResponse.class);
        return result.searchUsers();
    }

}