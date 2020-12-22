package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterResourceActionsQueryResponse extends GraphQLResult<Map<String, java.util.List<String>>> {

    private static final String OPERATION_NAME = "dataCenterResourceActions";

    public DataCenterResourceActionsQueryResponse() {
    }

    public java.util.List<String> dataCenterResourceActions() {
        Map<String, java.util.List<String>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
