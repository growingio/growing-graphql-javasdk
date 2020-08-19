package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createCustomEvent in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationCreateCustomEventParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private CustomEventInputDto customEvent;

    public MutationCreateCustomEventParametrizedInput() {
    }

    public MutationCreateCustomEventParametrizedInput(CustomEventInputDto customEvent) {
        this.customEvent = customEvent;
    }

    public MutationCreateCustomEventParametrizedInput customEvent(CustomEventInputDto customEvent) {
        this.customEvent = customEvent;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (customEvent != null) {
            joiner.add("customEvent: " + GraphQLRequestSerializer.getEntry(customEvent));
        }
        return joiner.toString();
    }

}
