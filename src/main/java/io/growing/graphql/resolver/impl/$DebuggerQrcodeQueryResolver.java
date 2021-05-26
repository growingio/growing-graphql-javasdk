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
final public class $DebuggerQrcodeQueryResolver implements DebuggerQrcodeQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DebuggerQrcodeQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DebuggerQrcodeQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DebuggerQrcodeDto debuggerQrcode(String productId) throws Exception {
        DebuggerQrcodeQueryRequest request = new DebuggerQrcodeQueryRequest();
        List<String> keys = Arrays.asList("productId");
        List<?> values = Arrays.asList(productId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DebuggerQrcodeResponseProjection projection = new DebuggerQrcodeResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DebuggerQrcodeQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DebuggerQrcodeQueryResponse.class);
        return result.debuggerQrcode();
    }

}