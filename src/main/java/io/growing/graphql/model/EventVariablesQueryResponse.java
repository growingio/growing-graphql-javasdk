package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 事件变量列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class EventVariablesQueryResponse extends GraphQLResult<Map<String, java.util.List<EventVariableDto>>> {

    private static final String OPERATION_NAME = "eventVariables";

    public EventVariablesQueryResponse() {
    }

    /**
     * 事件变量列表
     */
    public java.util.List<EventVariableDto> eventVariables() {
        Map<String, java.util.List<EventVariableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
