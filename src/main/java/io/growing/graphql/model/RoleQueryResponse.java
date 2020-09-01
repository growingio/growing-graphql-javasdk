package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class RoleQueryResponse extends GraphQLResult<Map<String, RoleDto>> {

    private static final String OPERATION_NAME = "role";

    public RoleQueryResponse() {
    }

    public RoleDto role() {
        Map<String, RoleDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
