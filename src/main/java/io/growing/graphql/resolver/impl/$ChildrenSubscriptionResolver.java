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
final public class $ChildrenSubscriptionResolver implements ChildrenSubscriptionResolver {

    private GrowingIOConfig growingIOConfig;

    public $ChildrenSubscriptionResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ChildrenSubscriptionResolver() {}

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