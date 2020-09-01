package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class StatusSubscriptionResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "status";

    public StatusSubscriptionResponse() {
    }

    public String status() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
