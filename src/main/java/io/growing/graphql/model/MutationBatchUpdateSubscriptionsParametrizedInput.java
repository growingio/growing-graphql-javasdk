package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field batchUpdateSubscriptions in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationBatchUpdateSubscriptionsParametrizedInput implements GraphQLParametrizedInput {

    private String projectId;
    private SubscriptionTypeDto type;
    @javax.validation.constraints.NotNull
    private java.util.List<SubscriptionInputDto> subscriptions;

    public MutationBatchUpdateSubscriptionsParametrizedInput() {
    }

    public MutationBatchUpdateSubscriptionsParametrizedInput(String projectId, SubscriptionTypeDto type, java.util.List<SubscriptionInputDto> subscriptions) {
        this.projectId = projectId;
        this.type = type;
        this.subscriptions = subscriptions;
    }

    public MutationBatchUpdateSubscriptionsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationBatchUpdateSubscriptionsParametrizedInput type(SubscriptionTypeDto type) {
        this.type = type;
        return this;
    }

    public MutationBatchUpdateSubscriptionsParametrizedInput subscriptions(java.util.List<SubscriptionInputDto> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (subscriptions != null) {
            joiner.add("subscriptions: " + GraphQLRequestSerializer.getEntry(subscriptions));
        }
        return joiner.toString();
    }

}
