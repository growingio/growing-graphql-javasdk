package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userProfileWithTime in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryUserProfileWithTimeParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String userId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;

    public QueryUserProfileWithTimeParametrizedInput() {
    }

    public QueryUserProfileWithTimeParametrizedInput(String projectId, String userId, java.util.List<String> tags, java.util.List<String> properties) {
        this.projectId = projectId;
        this.userId = userId;
        this.tags = tags;
        this.properties = properties;
    }

    public QueryUserProfileWithTimeParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryUserProfileWithTimeParametrizedInput userId(String userId) {
        this.userId = userId;
        return this;
    }

    public QueryUserProfileWithTimeParametrizedInput tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public QueryUserProfileWithTimeParametrizedInput properties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
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
