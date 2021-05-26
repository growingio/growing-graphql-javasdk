package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 删除分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DeleteCategoryMutationResolver {

    /**
     * 删除分类
     */
    Boolean deleteCategory(String id) throws Exception;

}