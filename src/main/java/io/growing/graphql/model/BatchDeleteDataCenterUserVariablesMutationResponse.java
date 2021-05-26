package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 更批量删除用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class BatchDeleteDataCenterUserVariablesMutationResponse extends GraphQLResult<Map<String, Boolean>> {

    private static final String OPERATION_NAME = "batchDeleteDataCenterUserVariables";

    public BatchDeleteDataCenterUserVariablesMutationResponse() {
    }

    /**
     * 数据中心 更批量删除用户属性
     */
    public Boolean batchDeleteDataCenterUserVariables() {
        Map<String, Boolean> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
