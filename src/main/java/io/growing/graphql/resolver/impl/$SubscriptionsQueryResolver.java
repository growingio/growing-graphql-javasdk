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
final public class $SubscriptionsQueryResolver implements SubscriptionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $SubscriptionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SubscriptionsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<SubscriptionDto> subscriptions(String projectId, SubscriptionTypeDto type) throws Exception {
        SubscriptionsQueryRequest request = new SubscriptionsQueryRequest();
        List<String> keys = Arrays.asList("projectId", "type");
        List<?> values = Arrays.asList(projectId, type);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SubscriptionResponseProjection projection = new SubscriptionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubscriptionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubscriptionsQueryResponse.class);
        return result.subscriptions();
    }

}