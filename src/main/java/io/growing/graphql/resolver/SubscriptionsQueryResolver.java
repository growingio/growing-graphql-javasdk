package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public interface SubscriptionsQueryResolver {

    @javax.validation.constraints.NotNull
    java.util.List<SubscriptionDto> subscriptions(SubscriptionTypeDto type) throws Exception;

}