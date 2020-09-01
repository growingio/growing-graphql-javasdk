package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field departments in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:35+0800"
)
public class QueryDepartmentsParametrizedInput implements GraphQLParametrizedInput {

    private String parentId;

    public QueryDepartmentsParametrizedInput() {
    }

    public QueryDepartmentsParametrizedInput(String parentId) {
        this.parentId = parentId;
    }

    public QueryDepartmentsParametrizedInput parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (parentId != null) {
            joiner.add("parentId: " + GraphQLRequestSerializer.getEntry(parentId));
        }
        return joiner.toString();
    }

}
