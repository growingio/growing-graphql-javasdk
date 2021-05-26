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
final public class $WebHooksQueryResolver implements WebHooksQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $WebHooksQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $WebHooksQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<WebHookDto> webHooks() throws Exception {
        WebHooksQueryRequest request = new WebHooksQueryRequest();
        WebHookResponseProjection projection = new WebHookResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        WebHooksQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, WebHooksQueryResponse.class);
        return result.webHooks();
    }

}