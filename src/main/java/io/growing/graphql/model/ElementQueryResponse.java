package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class ElementQueryResponse extends GraphQLResult<Map<String, ElementDto>> {

    private static final String OPERATION_NAME = "element";

    public ElementQueryResponse() {
    }

    public ElementDto element() {
        Map<String, ElementDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
