package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateTag in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationUpdateTagParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private TagInputDto tag;

    public MutationUpdateTagParametrizedInput() {
    }

    public MutationUpdateTagParametrizedInput(String id, TagInputDto tag) {
        this.id = id;
        this.tag = tag;
    }

    public MutationUpdateTagParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateTagParametrizedInput tag(TagInputDto tag) {
        this.tag = tag;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (tag != null) {
            joiner.add("tag: " + GraphQLRequestSerializer.getEntry(tag));
        }
        return joiner.toString();
    }

}
