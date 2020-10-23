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
final public class DefaultSearchUserEventsQueryResolver implements SearchUserEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSearchUserEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSearchUserEventsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<String> searchUserEvents(String id, String q, String timeRange) throws Exception {
        SearchUserEventsQueryRequest request = new SearchUserEventsQueryRequest();
        List<String> keys = Arrays.asList("id", "q", "timeRange");
        List<?> values = Arrays.asList(id, q, timeRange);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        SearchUserEventsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SearchUserEventsQueryResponse.class);
        return result.searchUserEvents();
    }

}