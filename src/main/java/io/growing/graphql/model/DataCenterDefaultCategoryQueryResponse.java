package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 返回dataCenter级别未分类资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterDefaultCategoryQueryResponse extends GraphQLResult<Map<String, CategoryDto>> {

    private static final String OPERATION_NAME = "dataCenterDefaultCategory";

    public DataCenterDefaultCategoryQueryResponse() {
    }

    /**
     * 返回dataCenter级别未分类资源
     */
    public CategoryDto dataCenterDefaultCategory() {
        Map<String, CategoryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
