package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 根据资源返回其所属分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterGetCategoryByResourceQueryResolver {

    /**
     * 根据资源返回其所属分类
     */
    CategoryDto dataCenterGetCategoryByResource(CategoryResourceInputDto categoryResource) throws Exception;

}