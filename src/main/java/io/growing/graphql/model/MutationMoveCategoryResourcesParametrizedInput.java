package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field moveCategoryResources in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationMoveCategoryResourcesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String categoryId;
    private java.util.List<CategoryResourceInputDto> categoryResources;

    public MutationMoveCategoryResourcesParametrizedInput() {
    }

    public MutationMoveCategoryResourcesParametrizedInput(String categoryId, java.util.List<CategoryResourceInputDto> categoryResources) {
        this.categoryId = categoryId;
        this.categoryResources = categoryResources;
    }

    public MutationMoveCategoryResourcesParametrizedInput categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public MutationMoveCategoryResourcesParametrizedInput categoryResources(java.util.List<CategoryResourceInputDto> categoryResources) {
        this.categoryResources = categoryResources;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (categoryId != null) {
            joiner.add("categoryId: " + GraphQLRequestSerializer.getEntry(categoryId));
        }
        if (categoryResources != null) {
            joiner.add("categoryResources: " + GraphQLRequestSerializer.getEntry(categoryResources));
        }
        return joiner.toString();
    }

}
