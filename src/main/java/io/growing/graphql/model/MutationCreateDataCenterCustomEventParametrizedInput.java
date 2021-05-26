package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDataCenterCustomEvent in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateDataCenterCustomEventParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private CustomEventInputDto customEvent;

    public MutationCreateDataCenterCustomEventParametrizedInput() {
    }

    public MutationCreateDataCenterCustomEventParametrizedInput(CustomEventInputDto customEvent) {
        this.customEvent = customEvent;
    }

    public MutationCreateDataCenterCustomEventParametrizedInput customEvent(CustomEventInputDto customEvent) {
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
