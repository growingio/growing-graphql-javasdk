package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterSearchCategories in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryDataCenterSearchCategoriesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String q;
    private String resourceType;

    public QueryDataCenterSearchCategoriesParametrizedInput() {
    }

    public QueryDataCenterSearchCategoriesParametrizedInput(String q, String resourceType) {
        this.q = q;
        this.resourceType = resourceType;
    }

    public QueryDataCenterSearchCategoriesParametrizedInput q(String q) {
        this.q = q;
        return this;
    }

    public QueryDataCenterSearchCategoriesParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        return joiner.toString();
    }

}
