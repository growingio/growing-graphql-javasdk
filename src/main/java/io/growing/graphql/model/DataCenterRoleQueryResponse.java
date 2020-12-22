package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterRoleQueryResponse extends GraphQLResult<Map<String, DataCenterRoleDto>> {

    private static final String OPERATION_NAME = "dataCenterRole";

    public DataCenterRoleQueryResponse() {
    }

    public DataCenterRoleDto dataCenterRole() {
        Map<String, DataCenterRoleDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
