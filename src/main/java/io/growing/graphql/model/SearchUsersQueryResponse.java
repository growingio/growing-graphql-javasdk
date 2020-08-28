package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class SearchUsersQueryResponse extends GraphQLResult<Map<String, java.util.List<UserSearchDto>>> {

    private static final String OPERATION_NAME = "searchUsers";

    public SearchUsersQueryResponse() {
    }

    public java.util.List<UserSearchDto> searchUsers() {
        Map<String, java.util.List<UserSearchDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
