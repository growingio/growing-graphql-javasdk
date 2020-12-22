package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class CreateDataCenterUserVariableMutationResponse extends GraphQLResult<Map<String, UserVariableDto>> {

    private static final String OPERATION_NAME = "createDataCenterUserVariable";

    public CreateDataCenterUserVariableMutationResponse() {
    }

    public UserVariableDto createDataCenterUserVariable() {
        Map<String, UserVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
