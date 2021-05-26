package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field addCategoryResource in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationAddCategoryResourceParametrizedInput implements GraphQLParametrizedInput {

    private CategoryResourceInputDto categoryResource;

    public MutationAddCategoryResourceParametrizedInput() {
    }

    public MutationAddCategoryResourceParametrizedInput(CategoryResourceInputDto categoryResource) {
        this.categoryResource = categoryResource;
    }

    public MutationAddCategoryResourceParametrizedInput categoryResource(CategoryResourceInputDto categoryResource) {
        this.categoryResource = categoryResource;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (categoryResource != null) {
            joiner.add("categoryResource: " + GraphQLRequestSerializer.getEntry(categoryResource));
        }
        return joiner.toString();
    }

}
