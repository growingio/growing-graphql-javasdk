package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class ItemModelsQueryResponse extends GraphQLResult<Map<String, java.util.List<ItemModelDto>>> {

    private static final String OPERATION_NAME = "itemModels";

    public ItemModelsQueryResponse() {
    }

    public java.util.List<ItemModelDto> itemModels() {
        Map<String, java.util.List<ItemModelDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
