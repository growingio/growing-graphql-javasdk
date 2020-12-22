package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field users in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryUsersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private UserQueryTypeDto type;
    @javax.validation.constraints.NotNull
    private String id;
    private Integer offset;
    private Integer limit;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;

    public QueryUsersParametrizedInput() {
    }

    public QueryUsersParametrizedInput(String projectId, UserQueryTypeDto type, String id, Integer offset, Integer limit, java.util.List<String> tags, java.util.List<String> properties) {
        this.projectId = projectId;
        this.type = type;
        this.id = id;
        this.offset = offset;
        this.limit = limit;
        this.tags = tags;
        this.properties = properties;
    }

    public QueryUsersParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryUsersParametrizedInput type(UserQueryTypeDto type) {
        this.type = type;
        return this;
    }

    public QueryUsersParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryUsersParametrizedInput offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public QueryUsersParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public QueryUsersParametrizedInput tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public QueryUsersParametrizedInput properties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (offset != null) {
            joiner.add("offset: " + GraphQLRequestSerializer.getEntry(offset));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
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
