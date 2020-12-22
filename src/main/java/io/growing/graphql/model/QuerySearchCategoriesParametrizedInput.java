package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field searchCategories in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QuerySearchCategoriesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String q;

    public QuerySearchCategoriesParametrizedInput() {
    }

    public QuerySearchCategoriesParametrizedInput(String projectId, String q) {
        this.projectId = projectId;
        this.q = q;
    }

    public QuerySearchCategoriesParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QuerySearchCategoriesParametrizedInput q(String q) {
        this.q = q;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        return joiner.toString();
    }

}
