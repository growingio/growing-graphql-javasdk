package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 根据资源返回其所属分类
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterGetCategoryByResourceQueryResponse extends GraphQLResult<Map<String, CategoryDto>> {

    private static final String OPERATION_NAME = "dataCenterGetCategoryByResource";

    public DataCenterGetCategoryByResourceQueryResponse() {
    }

    /**
     * 根据资源返回其所属分类
     */
    public CategoryDto dataCenterGetCategoryByResource() {
        Map<String, CategoryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
