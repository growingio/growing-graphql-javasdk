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
 * 无埋点事件 即圈选事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $SimpleEventsQueryResolver implements SimpleEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $SimpleEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SimpleEventsQueryResolver() {}

    /**
     * 无埋点事件 即圈选事件
     */
    @Override
    public java.util.List<SimpleEventDto> simpleEvents(String projectId, String elementId) throws Exception {
        SimpleEventsQueryRequest request = new SimpleEventsQueryRequest();
        List<String> keys = Arrays.asList("projectId", "elementId");
        List<?> values = Arrays.asList(projectId, elementId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SimpleEventResponseProjection projection = new SimpleEventResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SimpleEventsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SimpleEventsQueryResponse.class);
        return result.simpleEvents();
    }

}