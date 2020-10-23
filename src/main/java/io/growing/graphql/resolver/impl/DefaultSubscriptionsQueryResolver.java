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
final public class DefaultSubscriptionsQueryResolver implements SubscriptionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSubscriptionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSubscriptionsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<SubscriptionDto> subscriptions(SubscriptionTypeDto type) throws Exception {
        SubscriptionsQueryRequest request = new SubscriptionsQueryRequest();
        List<String> keys = Arrays.asList("type");
        List<?> values = Arrays.asList(type);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SubscriptionResponseProjection projection = new SubscriptionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubscriptionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubscriptionsQueryResponse.class);
        return result.subscriptions();
    }

}