package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterSearchCategories in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryDataCenterSearchCategoriesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String q;

    public QueryDataCenterSearchCategoriesParametrizedInput() {
    }

    public QueryDataCenterSearchCategoriesParametrizedInput(String q) {
        this.q = q;
    }

    public QueryDataCenterSearchCategoriesParametrizedInput q(String q) {
        this.q = q;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        return joiner.toString();
    }

}
