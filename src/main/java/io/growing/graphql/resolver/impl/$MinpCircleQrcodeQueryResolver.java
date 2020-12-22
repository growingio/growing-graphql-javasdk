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

/**
 * 获取二维码长链
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $MinpCircleQrcodeQueryResolver implements MinpCircleQrcodeQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $MinpCircleQrcodeQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $MinpCircleQrcodeQueryResolver() {}

    /**
     * 获取二维码长链
     */
    @javax.validation.constraints.NotNull
    @Override
    public String minpCircleQrcode(String productId) throws Exception {
        MinpCircleQrcodeQueryRequest request = new MinpCircleQrcodeQueryRequest();
        List<String> keys = Arrays.asList("productId");
        List<?> values = Arrays.asList(productId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        MinpCircleQrcodeQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, MinpCircleQrcodeQueryResponse.class);
        return result.minpCircleQrcode();
    }

}