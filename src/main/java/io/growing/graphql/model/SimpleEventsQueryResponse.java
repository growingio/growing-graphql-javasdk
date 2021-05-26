package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 无埋点事件 即圈选事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SimpleEventsQueryResponse extends GraphQLResult<Map<String, java.util.List<SimpleEventDto>>> {

    private static final String OPERATION_NAME = "simpleEvents";

    public SimpleEventsQueryResponse() {
    }

    /**
     * 无埋点事件 即圈选事件
     */
    public java.util.List<SimpleEventDto> simpleEvents() {
        Map<String, java.util.List<SimpleEventDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
