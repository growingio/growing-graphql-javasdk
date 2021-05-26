package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 根据关键字查询在dataCenter级别下分类信息, resourceType: tag | userVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterSearchCategoriesQueryResolver {

    /**
     * 根据关键字查询在dataCenter级别下分类信息, resourceType: tag | userVariable
     */
    java.util.List<CategoryDto> dataCenterSearchCategories(String q, String resourceType) throws Exception;

}