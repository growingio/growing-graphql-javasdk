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
final public class DefaultChildrenSubscriptionResolver implements ChildrenSubscriptionResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultChildrenSubscriptionResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultChildrenSubscriptionResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<SubscriptionDto> children() throws Exception {
        ChildrenSubscriptionRequest request = new ChildrenSubscriptionRequest();
        SubscriptionResponseProjection projection = new SubscriptionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ChildrenSubscriptionResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ChildrenSubscriptionResponse.class);
        return result.children();
    }

}