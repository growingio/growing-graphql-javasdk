package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class SimpleEventsQueryResponse extends GraphQLResult<Map<String, java.util.List<SimpleEventDto>>> {

    private static final String OPERATION_NAME = "simpleEvents";

    public SimpleEventsQueryResponse() {
    }

    public java.util.List<SimpleEventDto> simpleEvents() {
        Map<String, java.util.List<SimpleEventDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
