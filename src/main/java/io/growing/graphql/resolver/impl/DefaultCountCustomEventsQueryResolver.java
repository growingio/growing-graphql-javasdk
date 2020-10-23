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
final public class DefaultCountCustomEventsQueryResolver implements CountCustomEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCountCustomEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCountCustomEventsQueryResolver() {}

    @Override
    public Integer countCustomEvents() throws Exception {
        CountCustomEventsQueryRequest request = new CountCustomEventsQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountCustomEventsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountCustomEventsQueryResponse.class);
        return result.countCustomEvents();
    }

}