package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class CreateRoleMutationResponse extends GraphQLResult<Map<String, RoleDto>> {

    private static final String OPERATION_NAME = "createRole";

    public CreateRoleMutationResponse() {
    }

    public RoleDto createRole() {
        Map<String, RoleDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
