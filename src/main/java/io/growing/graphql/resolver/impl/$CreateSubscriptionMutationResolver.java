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
final public class $CreateSubscriptionMutationResolver implements CreateSubscriptionMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateSubscriptionMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateSubscriptionMutationResolver() {}

    @Override
    public Boolean createSubscription(String projectId, SubscriptionTypeDto type, String id) throws Exception {
        CreateSubscriptionMutationRequest request = new CreateSubscriptionMutationRequest();
        List<String> keys = Arrays.asList("projectId", "type", "id");
        List<?> values = Arrays.asList(projectId, type, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CreateSubscriptionMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateSubscriptionMutationResponse.class);
        return result.createSubscription();
    }

}