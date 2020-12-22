package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的物品模型变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterItemVariablesQueryResponse extends GraphQLResult<Map<String, java.util.List<ItemVariableDto>>> {

    private static final String OPERATION_NAME = "dataCenterItemVariables";

    public DataCenterItemVariablesQueryResponse() {
    }

    /**
     * 数据中心的物品模型变量
     */
    public java.util.List<ItemVariableDto> dataCenterItemVariables() {
        Map<String, java.util.List<ItemVariableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
