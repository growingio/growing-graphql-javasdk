package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class UserGrantsQueryResponse extends GraphQLResult<Map<String, AccessEntryDto>> {

    private static final String OPERATION_NAME = "userGrants";

    public UserGrantsQueryResponse() {
    }

    public AccessEntryDto userGrants() {
        Map<String, AccessEntryDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
