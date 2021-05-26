package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 根据关键字查询分类, resourceType: tag | userVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SearchCategoriesQueryResponse extends GraphQLResult<Map<String, java.util.List<CategoryDto>>> {

    private static final String OPERATION_NAME = "searchCategories";

    public SearchCategoriesQueryResponse() {
    }

    /**
     * 根据关键字查询分类, resourceType: tag | userVariable
     */
    public java.util.List<CategoryDto> searchCategories() {
        Map<String, java.util.List<CategoryDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
