package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心 创建事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateDataCenterEventVariableMutationResponse extends GraphQLResult<Map<String, EventVariableDto>> {

    private static final String OPERATION_NAME = "createDataCenterEventVariable";

    public CreateDataCenterEventVariableMutationResponse() {
    }

    /**
     * 数据中心 创建事件变量
     */
    public EventVariableDto createDataCenterEventVariable() {
        Map<String, EventVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
