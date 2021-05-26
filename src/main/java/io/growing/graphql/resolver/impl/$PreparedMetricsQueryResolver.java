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
 * 预定义指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $PreparedMetricsQueryResolver implements PreparedMetricsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $PreparedMetricsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $PreparedMetricsQueryResolver() {}

    /**
     * 预定义指标列表
     */
    @Override
    public java.util.List<PreparedMetricDto> preparedMetrics() throws Exception {
        PreparedMetricsQueryRequest request = new PreparedMetricsQueryRequest();
        PreparedMetricResponseProjection projection = new PreparedMetricResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        PreparedMetricsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PreparedMetricsQueryResponse.class);
        return result.preparedMetrics();
    }

}