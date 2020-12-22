package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterInfoQueryResponse extends GraphQLResult<Map<String, DataCenterInfoDto>> {

    private static final String OPERATION_NAME = "dataCenterInfo";

    public DataCenterInfoQueryResponse() {
    }

    public DataCenterInfoDto dataCenterInfo() {
        Map<String, DataCenterInfoDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
