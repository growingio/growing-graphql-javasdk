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
 * 批量删除计算指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $BatchDeleteComplexMetricsMutationResolver implements BatchDeleteComplexMetricsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchDeleteComplexMetricsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchDeleteComplexMetricsMutationResolver() {}

    /**
     * 批量删除计算指标
     */
    @Override
    public Boolean batchDeleteComplexMetrics(String projectId, java.util.List<String> ids) throws Exception {
        BatchDeleteComplexMetricsMutationRequest request = new BatchDeleteComplexMetricsMutationRequest();
        List<String> keys = Arrays.asList("projectId", "ids");
        List<?> values = Arrays.asList(projectId, ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteComplexMetricsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteComplexMetricsMutationResponse.class);
        return result.batchDeleteComplexMetrics();
    }

}