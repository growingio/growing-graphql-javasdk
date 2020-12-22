package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class ProjectRolesQueryResponse extends GraphQLResult<Map<String, java.util.List<ProjectRoleDto>>> {

    private static final String OPERATION_NAME = "projectRoles";

    public ProjectRolesQueryResponse() {
    }

    public java.util.List<ProjectRoleDto> projectRoles() {
        Map<String, java.util.List<ProjectRoleDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
