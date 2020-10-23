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
final public class DefaultResourceActionsQueryResolver implements ResourceActionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultResourceActionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultResourceActionsQueryResolver() {}

    @Override
    public java.util.List<String> resourceActions(String resourceType, java.lang.Long resourceId) throws Exception {
        ResourceActionsQueryRequest request = new ResourceActionsQueryRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceId");
        List<?> values = Arrays.asList(resourceType, resourceId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        ResourceActionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ResourceActionsQueryResponse.class);
        return result.resourceActions();
    }

}