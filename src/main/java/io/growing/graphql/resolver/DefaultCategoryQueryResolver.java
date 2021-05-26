package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 根据资源类型查询未分类的资源列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DefaultCategoryQueryResolver {

    /**
     * 根据资源类型查询未分类的资源列表
     */
    CategoryDto defaultCategory(String resourceType, String projectId) throws Exception;

}