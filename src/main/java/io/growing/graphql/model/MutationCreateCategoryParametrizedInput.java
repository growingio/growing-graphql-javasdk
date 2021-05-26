package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createCategory in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateCategoryParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private CategoryInputDto category;

    public MutationCreateCategoryParametrizedInput() {
    }

    public MutationCreateCategoryParametrizedInput(CategoryInputDto category) {
        this.category = category;
    }

    public MutationCreateCategoryParametrizedInput category(CategoryInputDto category) {
        this.category = category;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        return joiner.toString();
    }

}
