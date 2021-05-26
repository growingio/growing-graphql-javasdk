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
 * 数据中心的 insightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $InsightDimensionsQueryResolver implements InsightDimensionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $InsightDimensionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $InsightDimensionsQueryResolver() {}

    /**
     * 数据中心的 insightDimensions
     */
    @Override
    public java.util.List<DimensionDto> insightDimensions(String projectId, java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception {
        InsightDimensionsQueryRequest request = new InsightDimensionsQueryRequest();
        List<String> keys = Arrays.asList("projectId", "measurements", "targetUsers");
        List<?> values = Arrays.asList(projectId, measurements, targetUsers);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DimensionResponseProjection projection = new DimensionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        InsightDimensionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, InsightDimensionsQueryResponse.class);
        return result.insightDimensions();
    }

}