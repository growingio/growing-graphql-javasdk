package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 向指定分类移动资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface MoveCategoryResourcesMutationResolver {

    /**
     * 向指定分类移动资源
     */
    java.util.List<CategoryResourceDto> moveCategoryResources(String categoryId, java.util.List<CategoryResourceInputDto> categoryResources) throws Exception;

}