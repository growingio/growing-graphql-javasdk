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
 * 获取IP，返回productId关联的，最多5个
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $MinpActiveUserIpsQueryResolver implements MinpActiveUserIpsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $MinpActiveUserIpsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $MinpActiveUserIpsQueryResolver() {}

    /**
     * 获取IP，返回productId关联的，最多5个
     */
    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<String> minpActiveUserIps(String productId) throws Exception {
        MinpActiveUserIpsQueryRequest request = new MinpActiveUserIpsQueryRequest();
        List<String> keys = Arrays.asList("productId");
        List<?> values = Arrays.asList(productId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        MinpActiveUserIpsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, MinpActiveUserIpsQueryResponse.class);
        return result.minpActiveUserIps();
    }

}