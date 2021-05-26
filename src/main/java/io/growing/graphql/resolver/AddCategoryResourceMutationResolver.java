package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 向分类添加资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface AddCategoryResourceMutationResolver {

    /**
     * 向分类添加资源
     */
    CategoryResourceDto addCategoryResource(CategoryResourceInputDto categoryResource) throws Exception;

}