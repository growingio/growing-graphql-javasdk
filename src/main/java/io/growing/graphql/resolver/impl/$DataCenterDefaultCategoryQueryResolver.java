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
final public class $DataCenterDefaultCategoryQueryResolver implements DataCenterDefaultCategoryQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterDefaultCategoryQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterDefaultCategoryQueryResolver() {}

    @Override
    public CategoryDto dataCenterDefaultCategory() throws Exception {
        DataCenterDefaultCategoryQueryRequest request = new DataCenterDefaultCategoryQueryRequest();
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterDefaultCategoryQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterDefaultCategoryQueryResponse.class);
        return result.dataCenterDefaultCategory();
    }

}