package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDataCenterTag in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateDataCenterTagParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private TagInputDto tag;

    public MutationCreateDataCenterTagParametrizedInput() {
    }

    public MutationCreateDataCenterTagParametrizedInput(TagInputDto tag) {
        this.tag = tag;
    }

    public MutationCreateDataCenterTagParametrizedInput tag(TagInputDto tag) {
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
