package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field subscriptions in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class QuerySubscriptionsParametrizedInput implements GraphQLParametrizedInput {

    private SubscriptionTypeDto type;

    public QuerySubscriptionsParametrizedInput() {
    }

    public QuerySubscriptionsParametrizedInput(SubscriptionTypeDto type) {
        this.type = type;
    }

    public QuerySubscriptionsParametrizedInput type(SubscriptionTypeDto type) {
        this.type = type;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

}
