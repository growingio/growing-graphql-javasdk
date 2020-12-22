package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class UserProjectPermissionModulesQueryResponse extends GraphQLResult<Map<String, java.util.List<ModuleDto>>> {

    private static final String OPERATION_NAME = "userProjectPermissionModules";

    public UserProjectPermissionModulesQueryResponse() {
    }

    public java.util.List<ModuleDto> userProjectPermissionModules() {
        Map<String, java.util.List<ModuleDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
