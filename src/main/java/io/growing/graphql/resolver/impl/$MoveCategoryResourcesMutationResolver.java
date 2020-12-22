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
final public class $MoveCategoryResourcesMutationResolver implements MoveCategoryResourcesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $MoveCategoryResourcesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $MoveCategoryResourcesMutationResolver() {}

    @Override
    public java.util.List<CategoryResourceDto> moveCategoryResources(String categoryId, java.util.List<CategoryResourceInputDto> categoryResources) throws Exception {
        MoveCategoryResourcesMutationRequest request = new MoveCategoryResourcesMutationRequest();
        List<String> keys = Arrays.asList("categoryId", "categoryResources");
        List<?> values = Arrays.asList(categoryId, categoryResources);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResourceResponseProjection projection = new CategoryResourceResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        MoveCategoryResourcesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, MoveCategoryResourcesMutationResponse.class);
        return result.moveCategoryResources();
    }

}