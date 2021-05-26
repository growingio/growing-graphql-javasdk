package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CurrentUserProjectRoleQueryResponse extends GraphQLResult<Map<String, ProjectRoleDto>> {

    private static final String OPERATION_NAME = "currentUserProjectRole";

    public CurrentUserProjectRoleQueryResponse() {
    }

    public ProjectRoleDto currentUserProjectRole() {
        Map<String, ProjectRoleDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
