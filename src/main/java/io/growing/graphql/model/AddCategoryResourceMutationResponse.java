package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 向分类添加资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class AddCategoryResourceMutationResponse extends GraphQLResult<Map<String, CategoryResourceDto>> {

    private static final String OPERATION_NAME = "addCategoryResource";

    public AddCategoryResourceMutationResponse() {
    }

    /**
     * 向分类添加资源
     */
    public CategoryResourceDto addCategoryResource() {
        Map<String, CategoryResourceDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
