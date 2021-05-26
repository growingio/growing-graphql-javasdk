package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 获取分类列表, resourceType: userVariable | tag, 也可以不填，不填时返回所有两种类型的结果
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CategoriesQueryResponse extends GraphQLResult<Map<String, java.util.List<CategoryDto>>> {

    private static final String OPERATION_NAME = "categories";

    public CategoriesQueryResponse() {
    }

    /**
     * 获取分类列表, resourceType: userVariable | tag, 也可以不填，不填时返回所有两种类型的结果
     */
    public java.util.List<CategoryDto> categories() {
        Map<String, java.util.List<CategoryDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
