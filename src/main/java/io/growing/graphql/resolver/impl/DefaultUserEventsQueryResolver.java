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
final public class DefaultUserEventsQueryResolver implements UserEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUserEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUserEventsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public CursorPaginationDto userEvents(String id, UserEventTypeDto type, String timeRange, Integer first, String after, Integer last, String before) throws Exception {
        UserEventsQueryRequest request = new UserEventsQueryRequest();
        List<String> keys = Arrays.asList("id", "type", "timeRange", "first", "after", "last", "before");
        List<?> values = Arrays.asList(id, type, timeRange, first, after, last, before);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CursorPaginationResponseProjection projection = new CursorPaginationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserEventsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserEventsQueryResponse.class);
        return result.userEvents();
    }

}