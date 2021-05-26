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
 * 数据中心的指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterMeasurementsQueryResolver implements DataCenterMeasurementsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterMeasurementsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterMeasurementsQueryResolver() {}

    /**
     * 数据中心的指标列表
     */
    @Override
    public java.util.List<MeasurableDto> dataCenterMeasurements() throws Exception {
        DataCenterMeasurementsQueryRequest request = new DataCenterMeasurementsQueryRequest();
        MeasurableResponseProjection projection = new MeasurableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterMeasurementsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterMeasurementsQueryResponse.class);
        return result.dataCenterMeasurements();
    }

}