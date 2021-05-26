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
 * 根据资源类型查询未分类的资源列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DefaultCategoryQueryResolver implements DefaultCategoryQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DefaultCategoryQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DefaultCategoryQueryResolver() {}

    /**
     * 根据资源类型查询未分类的资源列表
     */
    @Override
    public CategoryDto defaultCategory(String resourceType, String projectId) throws Exception {
        DefaultCategoryQueryRequest request = new DefaultCategoryQueryRequest();
        List<String> keys = Arrays.asList("resourceType", "projectId");
        List<?> values = Arrays.asList(resourceType, projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CategoryResponseProjection projection = new CategoryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DefaultCategoryQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DefaultCategoryQueryResponse.class);
        return result.defaultCategory();
    }

}