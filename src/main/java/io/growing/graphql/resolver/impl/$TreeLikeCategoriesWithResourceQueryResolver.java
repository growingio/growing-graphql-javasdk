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
final public class $TreeLikeCategoriesWithResourceQueryResolver implements TreeLikeCategoriesWithResourceQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $TreeLikeCategoriesWithResourceQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TreeLikeCategoriesWithResourceQueryResolver() {}

    @Override
    public java.util.List<CategoryDto> treeLikeCategoriesWithResource(String projectId) throws Exception {
        TreeLikeCategoriesWithResourceQueryRequest request = new TreeLikeCategoriesWithResourceQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        TreeLikeCategoriesWithResourceQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TreeLikeCategoriesWithResourceQueryResponse.class);
        return result.treeLikeCategoriesWithResource();
    }

}