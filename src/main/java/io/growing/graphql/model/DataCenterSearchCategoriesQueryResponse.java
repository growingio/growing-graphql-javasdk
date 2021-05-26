package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 根据关键字查询在dataCenter级别下分类信息, resourceType: tag | userVariable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterSearchCategoriesQueryResponse extends GraphQLResult<Map<String, java.util.List<CategoryDto>>> {

    private static final String OPERATION_NAME = "dataCenterSearchCategories";

    public DataCenterSearchCategoriesQueryResponse() {
    }

    /**
     * 根据关键字查询在dataCenter级别下分类信息, resourceType: tag | userVariable
     */
    public java.util.List<CategoryDto> dataCenterSearchCategories() {
        Map<String, java.util.List<CategoryDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
