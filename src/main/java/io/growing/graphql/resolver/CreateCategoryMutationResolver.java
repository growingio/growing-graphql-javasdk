package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 创建分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateCategoryMutationResolver {

    /**
     * 创建分类
     */
    CategoryDto createCategory(CategoryInputDto category) throws Exception;

}