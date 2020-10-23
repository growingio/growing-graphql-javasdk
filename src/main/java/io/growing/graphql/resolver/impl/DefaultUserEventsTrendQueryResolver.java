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
final public class DefaultUserEventsTrendQueryResolver implements UserEventsTrendQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUserEventsTrendQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUserEventsTrendQueryResolver() {}

    @Override
    public EventTrendDto userEventsTrend(String id) throws Exception {
        UserEventsTrendQueryRequest request = new UserEventsTrendQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventTrendResponseProjection projection = new EventTrendResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserEventsTrendQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserEventsTrendQueryResponse.class);
        return result.userEventsTrend();
    }

}