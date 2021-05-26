package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 更新分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateCategoryMutationResolver {

    /**
     * 更新分类
     */
    CategoryDto updateCategory(String id, CategoryInputDto category) throws Exception;

}