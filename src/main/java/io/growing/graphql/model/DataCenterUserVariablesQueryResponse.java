package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的用户变量列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterUserVariablesQueryResponse extends GraphQLResult<Map<String, java.util.List<UserVariableDto>>> {

    private static final String OPERATION_NAME = "dataCenterUserVariables";

    public DataCenterUserVariablesQueryResponse() {
    }

    /**
     * 数据中心的用户变量列表
     */
    public java.util.List<UserVariableDto> dataCenterUserVariables() {
        Map<String, java.util.List<UserVariableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
