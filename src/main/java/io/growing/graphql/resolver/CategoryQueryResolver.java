package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 根据分类ID获取分类信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CategoryQueryResolver {

    /**
     * 根据分类ID获取分类信息
     */
    CategoryDto category(String id) throws Exception;

}