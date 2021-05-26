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
 * 大洋分析计算指标查询列表页接口(由ID查询仍走旧接口)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $ComplexMetricsV2QueryResolver implements ComplexMetricsV2QueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $ComplexMetricsV2QueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ComplexMetricsV2QueryResolver() {}

    /**
     * 大洋分析计算指标查询列表页接口(由ID查询仍走旧接口)
     */
    @Override
    public java.util.List<ComplexMetricDto> complexMetricsV2(String projectId) throws Exception {
        ComplexMetricsV2QueryRequest request = new ComplexMetricsV2QueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ComplexMetricResponseProjection projection = new ComplexMetricResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ComplexMetricsV2QueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ComplexMetricsV2QueryResponse.class);
        return result.complexMetricsV2();
    }

}