package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 根据资源类型与项目id返回树状结构分类信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TreeLikeCategoriesWithResourceQueryResponse extends GraphQLResult<Map<String, java.util.List<CategoryDto>>> {

    private static final String OPERATION_NAME = "treeLikeCategoriesWithResource";

    public TreeLikeCategoriesWithResourceQueryResponse() {
    }

    /**
     * 根据资源类型与项目id返回树状结构分类信息
     */
    public java.util.List<CategoryDto> treeLikeCategoriesWithResource() {
        Map<String, java.util.List<CategoryDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
