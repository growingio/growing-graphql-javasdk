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
 * 数据中心的预定定维度
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterPreparedDimensionsQueryResolver implements DataCenterPreparedDimensionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterPreparedDimensionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterPreparedDimensionsQueryResolver() {}

    /**
     * 数据中心的预定定维度
     */
    @Override
    public java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions() throws Exception {
        DataCenterPreparedDimensionsQueryRequest request = new DataCenterPreparedDimensionsQueryRequest();
        PreparedDimensionResponseProjection projection = new PreparedDimensionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterPreparedDimensionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterPreparedDimensionsQueryResponse.class);
        return result.dataCenterPreparedDimensions();
    }

}