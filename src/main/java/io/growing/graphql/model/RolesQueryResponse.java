package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class RolesQueryResponse extends GraphQLResult<Map<String, java.util.List<RoleDto>>> {

    private static final String OPERATION_NAME = "roles";

    public RolesQueryResponse() {
    }

    public java.util.List<RoleDto> roles() {
        Map<String, java.util.List<RoleDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
