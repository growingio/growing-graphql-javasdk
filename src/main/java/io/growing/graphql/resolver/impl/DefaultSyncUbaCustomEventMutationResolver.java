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
final public class DefaultSyncUbaCustomEventMutationResolver implements SyncUbaCustomEventMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSyncUbaCustomEventMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSyncUbaCustomEventMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<CustomEventDto> syncUbaCustomEvent(String tunnelId, java.util.List<UbaCustomEventInputDto> ubaCustomEvents) throws Exception {
        SyncUbaCustomEventMutationRequest request = new SyncUbaCustomEventMutationRequest();
        List<String> keys = Arrays.asList("tunnelId", "ubaCustomEvents");
        List<?> values = Arrays.asList(tunnelId, ubaCustomEvents);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CustomEventResponseProjection projection = new CustomEventResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SyncUbaCustomEventMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SyncUbaCustomEventMutationResponse.class);
        return result.syncUbaCustomEvent();
    }

}