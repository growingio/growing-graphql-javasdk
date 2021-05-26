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
 * 预定义维度列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $PreparedDimensionsQueryResolver implements PreparedDimensionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $PreparedDimensionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $PreparedDimensionsQueryResolver() {}

    /**
     * 预定义维度列表
     */
    @Override
    public java.util.List<PreparedDimensionDto> preparedDimensions(String projectId) throws Exception {
        PreparedDimensionsQueryRequest request = new PreparedDimensionsQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        PreparedDimensionResponseProjection projection = new PreparedDimensionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        PreparedDimensionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PreparedDimensionsQueryResponse.class);
        return result.preparedDimensions();
    }

}