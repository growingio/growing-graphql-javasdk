package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 根据资源id返回dataCenter级别下树状结构分类信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterTreeLikeCategoryWithResourceQueryResponse extends GraphQLResult<Map<String, CategoryDto>> {

    private static final String OPERATION_NAME = "dataCenterTreeLikeCategoryWithResource";

    public DataCenterTreeLikeCategoryWithResourceQueryResponse() {
    }

    /**
     * 根据资源id返回dataCenter级别下树状结构分类信息
     */
    public CategoryDto dataCenterTreeLikeCategoryWithResource() {
        Map<String, CategoryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
