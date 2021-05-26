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
 * 根据资源返回其所属分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterGetCategoryByResourceQueryResolver implements DataCenterGetCategoryByResourceQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterGetCategoryByResourceQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterGetCategoryByResourceQueryResolver() {}

    /**
     * 根据资源返回其所属分类
     */
    @Override
    public CategoryDto dataCenterGetCategoryByResource(CategoryResourceInputDto categoryResource) throws Exception {
        DataCenterGetCategoryByResourceQueryRequest request = new DataCenterGetCategoryByResourceQueryRequest();
        List<String> keys = Arrays.asList("categoryResource");
        List<?> values = Arrays.asList(categoryResource);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterGetCategoryByResourceQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterGetCategoryByResourceQueryResponse.class);
        return result.dataCenterGetCategoryByResource();
    }

}