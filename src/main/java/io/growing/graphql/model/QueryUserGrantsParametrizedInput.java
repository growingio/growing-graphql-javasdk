package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userGrants in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class QueryUserGrantsParametrizedInput implements GraphQLParametrizedInput {

    private String resourceType;
    private java.lang.Long resourceId;

    public QueryUserGrantsParametrizedInput() {
    }

    public QueryUserGrantsParametrizedInput(String resourceType, java.lang.Long resourceId) {
        this.resourceType = resourceType;
        this.resourceId = resourceId;
    }

    public QueryUserGrantsParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public QueryUserGrantsParametrizedInput resourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        return joiner.toString();
    }

}
