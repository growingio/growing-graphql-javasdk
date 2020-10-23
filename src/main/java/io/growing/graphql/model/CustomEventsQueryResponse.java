package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class CustomEventsQueryResponse extends GraphQLResult<Map<String, java.util.List<CustomEventDto>>> {

    private static final String OPERATION_NAME = "customEvents";

    public CustomEventsQueryResponse() {
    }

    public java.util.List<CustomEventDto> customEvents() {
        Map<String, java.util.List<CustomEventDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
