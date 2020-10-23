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
final public class DefaultInsightDimensionsQueryResolver implements InsightDimensionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultInsightDimensionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultInsightDimensionsQueryResolver() {}

    @Override
    public java.util.List<DimensionDto> insightDimensions(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception {
        InsightDimensionsQueryRequest request = new InsightDimensionsQueryRequest();
        List<String> keys = Arrays.asList("measurements", "targetUsers");
        List<?> values = Arrays.asList(measurements, targetUsers);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DimensionResponseProjection projection = new DimensionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        InsightDimensionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, InsightDimensionsQueryResponse.class);
        return result.insightDimensions();
    }

}