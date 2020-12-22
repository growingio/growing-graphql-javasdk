package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterAclsQueryResponse extends GraphQLResult<Map<String, java.util.List<UserAccessCtrlDto>>> {

    private static final String OPERATION_NAME = "dataCenterAcls";

    public DataCenterAclsQueryResponse() {
    }

    public java.util.List<UserAccessCtrlDto> dataCenterAcls() {
        Map<String, java.util.List<UserAccessCtrlDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
