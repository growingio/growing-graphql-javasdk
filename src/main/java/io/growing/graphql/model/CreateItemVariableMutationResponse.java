package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class CreateItemVariableMutationResponse extends GraphQLResult<Map<String, ItemVariableDto>> {

    private static final String OPERATION_NAME = "createItemVariable";

    public CreateItemVariableMutationResponse() {
    }

    public ItemVariableDto createItemVariable() {
        Map<String, ItemVariableDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
