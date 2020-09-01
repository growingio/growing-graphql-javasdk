package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class ResourceActionsQueryResponse extends GraphQLResult<Map<String, java.util.List<String>>> {

    private static final String OPERATION_NAME = "resourceActions";

    public ResourceActionsQueryResponse() {
    }

    public java.util.List<String> resourceActions() {
        Map<String, java.util.List<String>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
