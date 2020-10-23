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
final public class DefaultBatchUpdateSubscriptionsMutationResolver implements BatchUpdateSubscriptionsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultBatchUpdateSubscriptionsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultBatchUpdateSubscriptionsMutationResolver() {}

    @Override
    public Boolean batchUpdateSubscriptions(SubscriptionTypeDto type, java.util.List<SubscriptionInputDto> subscriptions) throws Exception {
        BatchUpdateSubscriptionsMutationRequest request = new BatchUpdateSubscriptionsMutationRequest();
        List<String> keys = Arrays.asList("type", "subscriptions");
        List<?> values = Arrays.asList(type, subscriptions);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchUpdateSubscriptionsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchUpdateSubscriptionsMutationResponse.class);
        return result.batchUpdateSubscriptions();
    }

}