package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 根据分类ID获取分类信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CategoryQueryResponse extends GraphQLResult<Map<String, CategoryDto>> {

    private static final String OPERATION_NAME = "category";

    public CategoryQueryResponse() {
    }

    /**
     * 根据分类ID获取分类信息
     */
    public CategoryDto category() {
        Map<String, CategoryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
