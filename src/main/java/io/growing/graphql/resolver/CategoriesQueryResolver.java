package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 获取分类列表, resourceType: userVariable | tag, 也可以不填，不填时返回所有两种类型的结果
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CategoriesQueryResolver {

    /**
     * 获取分类列表, resourceType: userVariable | tag, 也可以不填，不填时返回所有两种类型的结果
     */
    java.util.List<CategoryDto> categories(String resourceType) throws Exception;

}