package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createNotificationTask in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateNotificationTaskParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private NotificationTaskInputDto input;

    public MutationCreateNotificationTaskParametrizedInput() {
    }

    public MutationCreateNotificationTaskParametrizedInput(NotificationTaskInputDto input) {
        this.input = input;
    }

    public MutationCreateNotificationTaskParametrizedInput input(NotificationTaskInputDto input) {
        this.input = input;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (input != null) {
            joiner.add("input: " + GraphQLRequestSerializer.getEntry(input));
        }
        return joiner.toString();
    }

}
