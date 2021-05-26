package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 批量删除事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class BatchDeleteDataCenterEventVariablesMutationResponse extends GraphQLResult<Map<String, Boolean>> {

    private static final String OPERATION_NAME = "batchDeleteDataCenterEventVariables";

    public BatchDeleteDataCenterEventVariablesMutationResponse() {
    }

    /**
     * 数据中心 批量删除事件变量
     */
    public Boolean batchDeleteDataCenterEventVariables() {
        Map<String, Boolean> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
