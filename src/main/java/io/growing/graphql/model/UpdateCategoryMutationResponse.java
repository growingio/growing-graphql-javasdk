package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 更新分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateCategoryMutationResponse extends GraphQLResult<Map<String, CategoryDto>> {

    private static final String OPERATION_NAME = "updateCategory";

    public UpdateCategoryMutationResponse() {
    }

    /**
     * 更新分类
     */
    public CategoryDto updateCategory() {
        Map<String, CategoryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
