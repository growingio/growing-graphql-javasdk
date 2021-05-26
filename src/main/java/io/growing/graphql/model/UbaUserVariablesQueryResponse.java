package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UbaUserVariablesQueryResponse extends GraphQLResult<Map<String, java.util.List<UserVariableDto>>> {

    private static final String OPERATION_NAME = "ubaUserVariables";

    public UbaUserVariablesQueryResponse() {
    }

    public java.util.List<UserVariableDto> ubaUserVariables() {
        Map<String, java.util.List<UserVariableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
