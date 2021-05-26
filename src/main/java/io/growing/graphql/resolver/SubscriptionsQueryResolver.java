package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface SubscriptionsQueryResolver {

    @javax.validation.constraints.NotNull
    java.util.List<SubscriptionDto> subscriptions(String projectId, SubscriptionTypeDto type) throws Exception;

}