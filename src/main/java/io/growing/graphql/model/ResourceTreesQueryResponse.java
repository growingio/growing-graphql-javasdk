package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class ResourceTreesQueryResponse extends GraphQLResult<Map<String, java.util.List<TreeNodeDto>>> {

    private static final String OPERATION_NAME = "resourceTrees";

    public ResourceTreesQueryResponse() {
    }

    public java.util.List<TreeNodeDto> resourceTrees() {
        Map<String, java.util.List<TreeNodeDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
