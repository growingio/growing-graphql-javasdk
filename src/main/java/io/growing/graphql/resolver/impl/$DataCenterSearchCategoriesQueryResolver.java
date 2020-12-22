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
final public class $DataCenterSearchCategoriesQueryResolver implements DataCenterSearchCategoriesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterSearchCategoriesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterSearchCategoriesQueryResolver() {}

    @Override
    public java.util.List<CategoryDto> dataCenterSearchCategories(String q) throws Exception {
        DataCenterSearchCategoriesQueryRequest request = new DataCenterSearchCategoriesQueryRequest();
        List<String> keys = Arrays.asList("q");
        List<?> values = Arrays.asList(q);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterSearchCategoriesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterSearchCategoriesQueryResponse.class);
        return result.dataCenterSearchCategories();
    }

}