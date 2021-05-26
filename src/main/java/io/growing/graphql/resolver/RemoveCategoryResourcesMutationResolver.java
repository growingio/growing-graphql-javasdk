package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 删除分类内资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface RemoveCategoryResourcesMutationResolver {

    /**
     * 删除分类内资源
     */
    Boolean removeCategoryResources(java.util.List<CategoryResourceInputDto> categoryResources) throws Exception;

}