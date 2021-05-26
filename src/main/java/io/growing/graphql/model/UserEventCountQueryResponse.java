package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserEventCountQueryResponse extends GraphQLResult<Map<String, UserEventCountDto>> {

    private static final String OPERATION_NAME = "userEventCount";

    public UserEventCountQueryResponse() {
    }

    public UserEventCountDto userEventCount() {
        Map<String, UserEventCountDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
