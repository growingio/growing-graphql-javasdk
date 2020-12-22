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
    date = "2020-12-22T15:45:58+0800"
)
final public class $SearchCategoriesQueryResolver implements SearchCategoriesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $SearchCategoriesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SearchCategoriesQueryResolver() {}

    @Override
    public java.util.List<CategoryDto> searchCategories(String projectId, String q) throws Exception {
        SearchCategoriesQueryRequest request = new SearchCategoriesQueryRequest();
        List<String> keys = Arrays.asList("projectId", "q");
        List<?> values = Arrays.asList(projectId, q);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SearchCategoriesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SearchCategoriesQueryResponse.class);
        return result.searchCategories();
    }

}