package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterUserProfile in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryDataCenterUserProfileParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String userId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;

    public QueryDataCenterUserProfileParametrizedInput() {
    }

    public QueryDataCenterUserProfileParametrizedInput(String userId, java.util.List<String> tags, java.util.List<String> properties) {
        this.userId = userId;
        this.tags = tags;
        this.properties = properties;
    }

    public QueryDataCenterUserProfileParametrizedInput userId(String userId) {
        this.userId = userId;
        return this;
    }

    public QueryDataCenterUserProfileParametrizedInput tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public QueryDataCenterUserProfileParametrizedInput properties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

}
