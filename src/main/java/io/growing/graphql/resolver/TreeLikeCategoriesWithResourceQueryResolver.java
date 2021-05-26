package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 根据资源类型与项目id返回树状结构分类信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface TreeLikeCategoriesWithResourceQueryResolver {

    /**
     * 根据资源类型与项目id返回树状结构分类信息
     */
    java.util.List<CategoryDto> treeLikeCategoriesWithResource(String projectId, String resourceType) throws Exception;

}