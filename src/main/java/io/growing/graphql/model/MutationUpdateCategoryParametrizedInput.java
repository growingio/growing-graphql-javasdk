package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateCategory in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateCategoryParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private CategoryInputDto category;

    public MutationUpdateCategoryParametrizedInput() {
    }

    public MutationUpdateCategoryParametrizedInput(String id, CategoryInputDto category) {
        this.id = id;
        this.category = category;
    }

    public MutationUpdateCategoryParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateCategoryParametrizedInput category(CategoryInputDto category) {
        this.category = category;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        return joiner.toString();
    }

}
