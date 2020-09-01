package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateCustomEvent in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class MutationUpdateCustomEventParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private CustomEventInputDto customEvent;

    public MutationUpdateCustomEventParametrizedInput() {
    }

    public MutationUpdateCustomEventParametrizedInput(String id, CustomEventInputDto customEvent) {
        this.id = id;
        this.customEvent = customEvent;
    }

    public MutationUpdateCustomEventParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateCustomEventParametrizedInput customEvent(CustomEventInputDto customEvent) {
        this.customEvent = customEvent;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (customEvent != null) {
            joiner.add("customEvent: " + GraphQLRequestSerializer.getEntry(customEvent));
        }
        return joiner.toString();
    }

}
