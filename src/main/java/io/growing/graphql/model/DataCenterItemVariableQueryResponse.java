package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 通过 id 获取数据中心的物品模型变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterItemVariableQueryResponse extends GraphQLResult<Map<String, ItemVariableDto>> {

    private static final String OPERATION_NAME = "dataCenterItemVariable";

    public DataCenterItemVariableQueryResponse() {
    }

    /**
     * 通过 id 获取数据中心的物品模型变量
     */
    public ItemVariableDto dataCenterItemVariable() {
        Map<String, ItemVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
