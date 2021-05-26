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
final public class $UserEventsTrendQueryResolver implements UserEventsTrendQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserEventsTrendQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserEventsTrendQueryResolver() {}

    @Override
    public EventTrendDto userEventsTrend(String projectId, String id, UserEventTypeDto type, String timeRange, java.lang.Long interval, java.util.List<String> eventKeys) throws Exception {
        UserEventsTrendQueryRequest request = new UserEventsTrendQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id", "type", "timeRange", "interval", "eventKeys");
        List<?> values = Arrays.asList(projectId, id, type, timeRange, interval, eventKeys);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventTrendResponseProjection projection = new EventTrendResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserEventsTrendQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserEventsTrendQueryResponse.class);
        return result.userEventsTrend();
    }

}