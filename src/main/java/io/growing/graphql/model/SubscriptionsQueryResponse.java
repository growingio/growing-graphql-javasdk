package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SubscriptionsQueryResponse extends GraphQLResult<Map<String, java.util.List<SubscriptionDto>>> {

    private static final String OPERATION_NAME = "subscriptions";

    public SubscriptionsQueryResponse() {
    }

    public java.util.List<SubscriptionDto> subscriptions() {
        Map<String, java.util.List<SubscriptionDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
