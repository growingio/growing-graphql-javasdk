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
    date = "2020-12-22T15:45:58+0800"
)
final public class $CircleQrcodeQueryResolver implements CircleQrcodeQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CircleQrcodeQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CircleQrcodeQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public CircleQrcodeDto circleQrcode(String productId) throws Exception {
        CircleQrcodeQueryRequest request = new CircleQrcodeQueryRequest();
        List<String> keys = Arrays.asList("productId");
        List<?> values = Arrays.asList(productId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CircleQrcodeResponseProjection projection = new CircleQrcodeResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CircleQrcodeQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CircleQrcodeQueryResponse.class);
        return result.circleQrcode();
    }

}