package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class ChildrenSubscriptionResponse extends GraphQLResult<Map<String, java.util.List<SubscriptionDto>>> {

    private static final String OPERATION_NAME = "children";

    public ChildrenSubscriptionResponse() {
    }

    public java.util.List<SubscriptionDto> children() {
        Map<String, java.util.List<SubscriptionDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
