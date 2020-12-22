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
    date = "2020-12-22T15:45:58+0800"
)
final public class $SimpleEventsQueryResolver implements SimpleEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $SimpleEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SimpleEventsQueryResolver() {}

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