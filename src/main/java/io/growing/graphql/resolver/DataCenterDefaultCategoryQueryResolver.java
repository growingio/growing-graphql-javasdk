package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 返回dataCenter级别未分类资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterDefaultCategoryQueryResolver {

    /**
     * 返回dataCenter级别未分类资源
     */
    CategoryDto dataCenterDefaultCategory(String resourceType) throws Exception;

}