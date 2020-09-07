package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createTag in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationCreateTagParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private TagInputDto tag;

    public MutationCreateTagParametrizedInput() {
    }

    public MutationCreateTagParametrizedInput(TagInputDto tag) {
        this.tag = tag;
    }

    public MutationCreateTagParametrizedInput tag(TagInputDto tag) {
        this.tag = tag;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tag != null) {
            joiner.add("tag: " + GraphQLRequestSerializer.getEntry(tag));
        }
        return joiner.toString();
    }

}
