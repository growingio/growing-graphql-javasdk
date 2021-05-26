package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 批量删除物品变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class BatchDeleteDataCenterItemVariablesMutationResponse extends GraphQLResult<Map<String, Boolean>> {

    private static final String OPERATION_NAME = "batchDeleteDataCenterItemVariables";

    public BatchDeleteDataCenterItemVariablesMutationResponse() {
    }

    /**
     * 数据中心 批量删除物品变量
     */
    public Boolean batchDeleteDataCenterItemVariables() {
        Map<String, Boolean> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
