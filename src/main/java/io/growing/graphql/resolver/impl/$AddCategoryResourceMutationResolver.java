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
final public class $AddCategoryResourceMutationResolver implements AddCategoryResourceMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $AddCategoryResourceMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AddCategoryResourceMutationResolver() {}

    @Override
    public CategoryResourceDto addCategoryResource(CategoryResourceInputDto categoryResource) throws Exception {
        AddCategoryResourceMutationRequest request = new AddCategoryResourceMutationRequest();
        List<String> keys = Arrays.asList("categoryResource");
        List<?> values = Arrays.asList(categoryResource);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResourceResponseProjection projection = new CategoryResourceResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        AddCategoryResourceMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AddCategoryResourceMutationResponse.class);
        return result.addCategoryResource();
    }

}