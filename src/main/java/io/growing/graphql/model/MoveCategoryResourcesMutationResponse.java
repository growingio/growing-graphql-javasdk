package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 向指定分类移动资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class MoveCategoryResourcesMutationResponse extends GraphQLResult<Map<String, java.util.List<CategoryResourceDto>>> {

    private static final String OPERATION_NAME = "moveCategoryResources";

    public MoveCategoryResourcesMutationResponse() {
    }

    /**
     * 向指定分类移动资源
     */
    public java.util.List<CategoryResourceDto> moveCategoryResources() {
        Map<String, java.util.List<CategoryResourceDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
