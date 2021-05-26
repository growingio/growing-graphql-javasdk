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
    date = "2021-05-26T15:01:24+0800"
)
final public class $UbaCustomEventsQueryResolver implements UbaCustomEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UbaCustomEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UbaCustomEventsQueryResolver() {}

    @Override
    public java.util.List<CustomEventDto> ubaCustomEvents(String tunnelId) throws Exception {
        UbaCustomEventsQueryRequest request = new UbaCustomEventsQueryRequest();
        List<String> keys = Arrays.asList("tunnelId");
        List<?> values = Arrays.asList(tunnelId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CustomEventResponseProjection projection = new CustomEventResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UbaCustomEventsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UbaCustomEventsQueryResponse.class);
        return result.ubaCustomEvents();
    }

}