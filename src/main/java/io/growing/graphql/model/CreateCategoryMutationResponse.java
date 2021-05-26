package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 创建分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateCategoryMutationResponse extends GraphQLResult<Map<String, CategoryDto>> {

    private static final String OPERATION_NAME = "createCategory";

    public CreateCategoryMutationResponse() {
    }

    /**
     * 创建分类
     */
    public CategoryDto createCategory() {
        Map<String, CategoryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
