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
final public class DefaultIdSubscriptionResolver implements IdSubscriptionResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultIdSubscriptionResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultIdSubscriptionResolver() {}

    @Override
    public String id() throws Exception {
        IdSubscriptionRequest request = new IdSubscriptionRequest();
        NamedEntityResponseProjection projection = new NamedEntityResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        IdSubscriptionResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, IdSubscriptionResponse.class);
        return result.id();
    }

}