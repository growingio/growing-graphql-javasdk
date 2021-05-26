package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 根据资源类型查询未分类的资源列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DefaultCategoryQueryResponse extends GraphQLResult<Map<String, CategoryDto>> {

    private static final String OPERATION_NAME = "defaultCategory";

    public DefaultCategoryQueryResponse() {
    }

    /**
     * 根据资源类型查询未分类的资源列表
     */
    public CategoryDto defaultCategory() {
        Map<String, CategoryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
