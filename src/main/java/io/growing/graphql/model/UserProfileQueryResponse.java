package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class UserProfileQueryResponse extends GraphQLResult<Map<String, UserProfileDto>> {

    private static final String OPERATION_NAME = "userProfile";

    public UserProfileQueryResponse() {
    }

    public UserProfileDto userProfile() {
        Map<String, UserProfileDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
