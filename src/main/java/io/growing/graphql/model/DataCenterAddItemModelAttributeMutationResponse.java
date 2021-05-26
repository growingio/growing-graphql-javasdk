package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 物品模型添加属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class DataCenterAddItemModelAttributeMutationResponse extends GraphQLResult<Map<String, ItemVariableDto>> {

    private static final String OPERATION_NAME = "dataCenterAddItemModelAttribute";

    public DataCenterAddItemModelAttributeMutationResponse() {
    }

    /**
     * 数据中心 物品模型添加属性
     */
    public ItemVariableDto dataCenterAddItemModelAttribute() {
        Map<String, ItemVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
