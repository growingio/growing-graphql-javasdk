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
final public class DefaultPreparedMetricsQueryResolver implements PreparedMetricsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultPreparedMetricsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultPreparedMetricsQueryResolver() {}

    @Override
    public java.util.List<PreparedMetricDto> preparedMetrics() throws Exception {
        PreparedMetricsQueryRequest request = new PreparedMetricsQueryRequest();
        PreparedMetricResponseProjection projection = new PreparedMetricResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        PreparedMetricsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PreparedMetricsQueryResponse.class);
        return result.preparedMetrics();
    }

}