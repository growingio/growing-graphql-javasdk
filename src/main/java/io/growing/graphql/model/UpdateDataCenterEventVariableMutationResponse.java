package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 更新事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class UpdateDataCenterEventVariableMutationResponse extends GraphQLResult<Map<String, EventVariableDto>> {

    private static final String OPERATION_NAME = "updateDataCenterEventVariable";

    public UpdateDataCenterEventVariableMutationResponse() {
    }

    /**
     * 数据中心 更新事件变量
     */
    public EventVariableDto updateDataCenterEventVariable() {
        Map<String, EventVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
