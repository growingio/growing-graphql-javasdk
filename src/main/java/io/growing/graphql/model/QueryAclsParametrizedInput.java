package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field acls in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class QueryAclsParametrizedInput implements GraphQLParametrizedInput {

    private String resourceType;

    public QueryAclsParametrizedInput() {
    }

    public QueryAclsParametrizedInput(String resourceType) {
        this.resourceType = resourceType;
    }

    public QueryAclsParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        return joiner.toString();
    }

}
