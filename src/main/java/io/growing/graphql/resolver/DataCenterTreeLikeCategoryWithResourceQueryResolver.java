package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 根据资源id返回dataCenter级别下树状结构分类信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterTreeLikeCategoryWithResourceQueryResolver {

    /**
     * 根据资源id返回dataCenter级别下树状结构分类信息
     */
    CategoryDto dataCenterTreeLikeCategoryWithResource(String id) throws Exception;

}