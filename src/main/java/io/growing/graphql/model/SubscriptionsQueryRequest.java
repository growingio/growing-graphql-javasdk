package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class SubscriptionsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "subscriptions";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SubscriptionsQueryRequest() {
    }

    public void setType(SubscriptionTypeDto type) {
        this.input.put("type", type);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private SubscriptionTypeDto type;

        public Builder() {
        }

        public Builder setType(SubscriptionTypeDto type) {
            this.type = type;
            return this;
        }


        public SubscriptionsQueryRequest build() {
            SubscriptionsQueryRequest obj = new SubscriptionsQueryRequest();
            obj.setType(type);
            return obj;
        }

    }
}
