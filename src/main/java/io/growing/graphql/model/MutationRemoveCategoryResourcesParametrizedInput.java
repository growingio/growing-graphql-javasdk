package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field removeCategoryResources in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationRemoveCategoryResourcesParametrizedInput implements GraphQLParametrizedInput {

    private java.util.List<CategoryResourceInputDto> categoryResources;

    public MutationRemoveCategoryResourcesParametrizedInput() {
    }

    public MutationRemoveCategoryResourcesParametrizedInput(java.util.List<CategoryResourceInputDto> categoryResources) {
        this.categoryResources = categoryResources;
    }

    public MutationRemoveCategoryResourcesParametrizedInput categoryResources(java.util.List<CategoryResourceInputDto> categoryResources) {
        this.categoryResources = categoryResources;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (categoryResources != null) {
            joiner.add("categoryResources: " + GraphQLRequestSerializer.getEntry(categoryResources));
        }
        return joiner.toString();
    }

}
