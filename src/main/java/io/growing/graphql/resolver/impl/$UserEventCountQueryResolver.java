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
final public class $UserEventCountQueryResolver implements UserEventCountQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserEventCountQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserEventCountQueryResolver() {}

    @Override
    public UserEventCountDto userEventCount(String projectId, String id, String timeRange, java.util.List<String> eventKeys) throws Exception {
        UserEventCountQueryRequest request = new UserEventCountQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id", "timeRange", "eventKeys");
        List<?> values = Arrays.asList(projectId, id, timeRange, eventKeys);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserEventCountResponseProjection projection = new UserEventCountResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserEventCountQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserEventCountQueryResponse.class);
        return result.userEventCount();
    }

}