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
final public class DefaultUpdateCustomEventMutationResolver implements UpdateCustomEventMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateCustomEventMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateCustomEventMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public CustomEventDto updateCustomEvent(String id, CustomEventInputDto customEvent) throws Exception {
        UpdateCustomEventMutationRequest request = new UpdateCustomEventMutationRequest();
        List<String> keys = Arrays.asList("id", "customEvent");
        List<?> values = Arrays.asList(id, customEvent);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CustomEventResponseProjection projection = new CustomEventResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateCustomEventMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateCustomEventMutationResponse.class);
        return result.updateCustomEvent();
    }

}