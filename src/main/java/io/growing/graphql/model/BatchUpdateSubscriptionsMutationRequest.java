package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class BatchUpdateSubscriptionsMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "batchUpdateSubscriptions";

    private Map<String, Object> input = new LinkedHashMap<>();

    public BatchUpdateSubscriptionsMutationRequest() {
    }

    public void setType(SubscriptionTypeDto type) {
        this.input.put("type", type);
    }

    public void setSubscriptions(java.util.List<SubscriptionInputDto> subscriptions) {
        this.input.put("subscriptions", subscriptions);
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
        private java.util.List<SubscriptionInputDto> subscriptions;

        public Builder() {
        }

        public Builder setType(SubscriptionTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setSubscriptions(java.util.List<SubscriptionInputDto> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }


        public BatchUpdateSubscriptionsMutationRequest build() {
            BatchUpdateSubscriptionsMutationRequest obj = new BatchUpdateSubscriptionsMutationRequest();
            obj.setType(type);
            obj.setSubscriptions(subscriptions);
            return obj;
        }

    }
}
