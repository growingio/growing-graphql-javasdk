package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field subscriptions in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QuerySubscriptionsParametrizedInput implements GraphQLParametrizedInput {

    private String projectId;
    private SubscriptionTypeDto type;

    public QuerySubscriptionsParametrizedInput() {
    }

    public QuerySubscriptionsParametrizedInput(String projectId, SubscriptionTypeDto type) {
        this.projectId = projectId;
        this.type = type;
    }

    public QuerySubscriptionsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QuerySubscriptionsParametrizedInput type(SubscriptionTypeDto type) {
        this.type = type;
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
        return joiner.toString();
    }

}
