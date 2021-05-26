package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createSubscription in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateSubscriptionParametrizedInput implements GraphQLParametrizedInput {

    private String projectId;
    private SubscriptionTypeDto type;
    @javax.validation.constraints.NotNull
    private String id;

    public MutationCreateSubscriptionParametrizedInput() {
    }

    public MutationCreateSubscriptionParametrizedInput(String projectId, SubscriptionTypeDto type, String id) {
        this.projectId = projectId;
        this.type = type;
        this.id = id;
    }

    public MutationCreateSubscriptionParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateSubscriptionParametrizedInput type(SubscriptionTypeDto type) {
        this.type = type;
        return this;
    }

    public MutationCreateSubscriptionParametrizedInput id(String id) {
        this.id = id;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

}
