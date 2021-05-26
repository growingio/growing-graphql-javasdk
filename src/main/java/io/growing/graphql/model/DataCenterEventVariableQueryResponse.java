package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 通过 id 获取数据中心的事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterEventVariableQueryResponse extends GraphQLResult<Map<String, EventVariableDto>> {

    private static final String OPERATION_NAME = "dataCenterEventVariable";

    public DataCenterEventVariableQueryResponse() {
    }

    /**
     * 通过 id 获取数据中心的事件变量
     */
    public EventVariableDto dataCenterEventVariable() {
        Map<String, EventVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
