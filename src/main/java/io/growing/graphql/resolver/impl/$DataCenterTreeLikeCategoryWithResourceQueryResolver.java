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
final public class $DataCenterTreeLikeCategoryWithResourceQueryResolver implements DataCenterTreeLikeCategoryWithResourceQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterTreeLikeCategoryWithResourceQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterTreeLikeCategoryWithResourceQueryResolver() {}

    @Override
    public CategoryDto dataCenterTreeLikeCategoryWithResource(String id) throws Exception {
        DataCenterTreeLikeCategoryWithResourceQueryRequest request = new DataCenterTreeLikeCategoryWithResourceQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterTreeLikeCategoryWithResourceQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterTreeLikeCategoryWithResourceQueryResponse.class);
        return result.dataCenterTreeLikeCategoryWithResource();
    }

}