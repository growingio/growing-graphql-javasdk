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
 * 返回dataCenter级别未分类资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterDefaultCategoryQueryResolver implements DataCenterDefaultCategoryQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterDefaultCategoryQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterDefaultCategoryQueryResolver() {}

    /**
     * 返回dataCenter级别未分类资源
     */
    @Override
    public CategoryDto dataCenterDefaultCategory(String resourceType) throws Exception {
        DataCenterDefaultCategoryQueryRequest request = new DataCenterDefaultCategoryQueryRequest();
        List<String> keys = Arrays.asList("resourceType");
        List<?> values = Arrays.asList(resourceType);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterDefaultCategoryQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterDefaultCategoryQueryResponse.class);
        return result.dataCenterDefaultCategory();
    }

}