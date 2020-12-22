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
final public class $BatchUpdateSubscriptionsMutationResolver implements BatchUpdateSubscriptionsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchUpdateSubscriptionsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchUpdateSubscriptionsMutationResolver() {}

    @Override
    public Boolean batchUpdateSubscriptions(String projectId, SubscriptionTypeDto type, java.util.List<SubscriptionInputDto> subscriptions) throws Exception {
        BatchUpdateSubscriptionsMutationRequest request = new BatchUpdateSubscriptionsMutationRequest();
        List<String> keys = Arrays.asList("projectId", "type", "subscriptions");
        List<?> values = Arrays.asList(projectId, type, subscriptions);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchUpdateSubscriptionsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchUpdateSubscriptionsMutationResponse.class);
        return result.batchUpdateSubscriptions();
    }

}