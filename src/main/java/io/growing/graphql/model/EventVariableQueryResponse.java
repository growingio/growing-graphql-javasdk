package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 单个事件变量详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class EventVariableQueryResponse extends GraphQLResult<Map<String, EventVariableDto>> {

    private static final String OPERATION_NAME = "eventVariable";

    public EventVariableQueryResponse() {
    }

    /**
     * 单个事件变量详情
     */
    public EventVariableDto eventVariable() {
        Map<String, EventVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
