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
 * 更新分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateCategoryMutationResolver implements UpdateCategoryMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateCategoryMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateCategoryMutationResolver() {}

    /**
     * 更新分类
     */
    @Override
    public CategoryDto updateCategory(String id, CategoryInputDto category) throws Exception {
        UpdateCategoryMutationRequest request = new UpdateCategoryMutationRequest();
        List<String> keys = Arrays.asList("id", "category");
        List<?> values = Arrays.asList(id, category);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateCategoryMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateCategoryMutationResponse.class);
        return result.updateCategory();
    }

}