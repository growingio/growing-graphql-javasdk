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
final public class DefaultStatusSubscriptionResolver implements StatusSubscriptionResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultStatusSubscriptionResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultStatusSubscriptionResolver() {}

    @Override
    public String status() throws Exception {
        StatusSubscriptionRequest request = new StatusSubscriptionRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        StatusSubscriptionResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, StatusSubscriptionResponse.class);
        return result.status();
    }

}