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
final public class DefaultUserGrantsQueryResolver implements UserGrantsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUserGrantsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUserGrantsQueryResolver() {}

    @Override
    public AccessEntryDto userGrants(String resourceType, java.lang.Long resourceId) throws Exception {
        UserGrantsQueryRequest request = new UserGrantsQueryRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceId");
        List<?> values = Arrays.asList(resourceType, resourceId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AccessEntryResponseProjection projection = new AccessEntryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserGrantsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserGrantsQueryResponse.class);
        return result.userGrants();
    }

}