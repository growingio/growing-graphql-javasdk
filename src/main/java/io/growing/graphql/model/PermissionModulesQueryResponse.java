package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class PermissionModulesQueryResponse extends GraphQLResult<Map<String, java.util.List<ModuleDto>>> {

    private static final String OPERATION_NAME = "permissionModules";

    public PermissionModulesQueryResponse() {
    }

    public java.util.List<ModuleDto> permissionModules() {
        Map<String, java.util.List<ModuleDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
