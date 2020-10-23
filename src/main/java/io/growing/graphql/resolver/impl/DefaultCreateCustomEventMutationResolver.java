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
final public class DefaultCreateCustomEventMutationResolver implements CreateCustomEventMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateCustomEventMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateCustomEventMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public CustomEventDto createCustomEvent(CustomEventInputDto customEvent) throws Exception {
        CreateCustomEventMutationRequest request = new CreateCustomEventMutationRequest();
        List<String> keys = Arrays.asList("customEvent");
        List<?> values = Arrays.asList(customEvent);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CustomEventResponseProjection projection = new CustomEventResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateCustomEventMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateCustomEventMutationResponse.class);
        return result.createCustomEvent();
    }

}