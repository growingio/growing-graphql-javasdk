package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 更新物品变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateDataCenterItemVariableMutationResponse extends GraphQLResult<Map<String, ItemVariableDto>> {

    private static final String OPERATION_NAME = "updateDataCenterItemVariable";

    public UpdateDataCenterItemVariableMutationResponse() {
    }

    /**
     * 数据中心 更新物品变量
     */
    public ItemVariableDto updateDataCenterItemVariable() {
        Map<String, ItemVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
