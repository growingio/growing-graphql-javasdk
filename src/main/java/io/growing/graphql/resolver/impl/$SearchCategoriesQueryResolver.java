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
 * 根据关键字查询分类, resourceType: tag | userVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $SearchCategoriesQueryResolver implements SearchCategoriesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $SearchCategoriesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SearchCategoriesQueryResolver() {}

    /**
     * 根据关键字查询分类, resourceType: tag | userVariable
     */
    @Override
    public java.util.List<CategoryDto> searchCategories(String projectId, String q, String resourceType) throws Exception {
        SearchCategoriesQueryRequest request = new SearchCategoriesQueryRequest();
        List<String> keys = Arrays.asList("projectId", "q", "resourceType");
        List<?> values = Arrays.asList(projectId, q, resourceType);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SearchCategoriesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SearchCategoriesQueryResponse.class);
        return result.searchCategories();
    }

}