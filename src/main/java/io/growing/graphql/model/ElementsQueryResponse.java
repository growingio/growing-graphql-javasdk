package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class ElementsQueryResponse extends GraphQLResult<Map<String, java.util.List<ElementDto>>> {

    private static final String OPERATION_NAME = "elements";

    public ElementsQueryResponse() {
    }

    public java.util.List<ElementDto> elements() {
        Map<String, java.util.List<ElementDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
