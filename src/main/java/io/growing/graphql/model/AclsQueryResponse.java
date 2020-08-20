package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class AclsQueryResponse extends GraphQLResult<Map<String, java.util.List<UserAccessCtrlDto>>> {

    private static final String OPERATION_NAME = "acls";

    public AclsQueryResponse() {
    }

    public java.util.List<UserAccessCtrlDto> acls() {
        Map<String, java.util.List<UserAccessCtrlDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
