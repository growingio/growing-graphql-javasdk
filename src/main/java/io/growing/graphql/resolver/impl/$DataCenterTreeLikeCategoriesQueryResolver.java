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
final public class $DataCenterTreeLikeCategoriesQueryResolver implements DataCenterTreeLikeCategoriesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterTreeLikeCategoriesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterTreeLikeCategoriesQueryResolver() {}

    @Override
    public java.util.List<CategoryDto> dataCenterTreeLikeCategories() throws Exception {
        DataCenterTreeLikeCategoriesQueryRequest request = new DataCenterTreeLikeCategoriesQueryRequest();
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterTreeLikeCategoriesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterTreeLikeCategoriesQueryResponse.class);
        return result.dataCenterTreeLikeCategories();
    }

}