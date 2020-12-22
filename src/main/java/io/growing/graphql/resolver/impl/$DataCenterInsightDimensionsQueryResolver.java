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
 * 数据中心的 InsightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $DataCenterInsightDimensionsQueryResolver implements DataCenterInsightDimensionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterInsightDimensionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterInsightDimensionsQueryResolver() {}

    /**
     * 数据中心的 InsightDimensions
     */
    @Override
    public java.util.List<DimensionDto> dataCenterInsightDimensions(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception {
        DataCenterInsightDimensionsQueryRequest request = new DataCenterInsightDimensionsQueryRequest();
        List<String> keys = Arrays.asList("measurements", "targetUsers");
        List<?> values = Arrays.asList(measurements, targetUsers);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DimensionResponseProjection projection = new DimensionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterInsightDimensionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterInsightDimensionsQueryResponse.class);
        return result.dataCenterInsightDimensions();
    }

}