package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterGetCategoryByResource in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryDataCenterGetCategoryByResourceParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private CategoryResourceInputDto categoryResource;

    public QueryDataCenterGetCategoryByResourceParametrizedInput() {
    }

    public QueryDataCenterGetCategoryByResourceParametrizedInput(CategoryResourceInputDto categoryResource) {
        this.categoryResource = categoryResource;
    }

    public QueryDataCenterGetCategoryByResourceParametrizedInput categoryResource(CategoryResourceInputDto categoryResource) {
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
