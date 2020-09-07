package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class UserPermissionModulesQueryResponse extends GraphQLResult<Map<String, java.util.List<ModuleDto>>> {

    private static final String OPERATION_NAME = "userPermissionModules";

    public UserPermissionModulesQueryResponse() {
    }

    public java.util.List<ModuleDto> userPermissionModules() {
        Map<String, java.util.List<ModuleDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
