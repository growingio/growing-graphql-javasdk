package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field searchUsers in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QuerySearchUsersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;
    @javax.validation.constraints.NotNull
    private FilterInputDto filter;

    public QuerySearchUsersParametrizedInput() {
    }

    public QuerySearchUsersParametrizedInput(String projectId, java.util.List<String> properties, FilterInputDto filter) {
        this.projectId = projectId;
        this.properties = properties;
        this.filter = filter;
    }

    public QuerySearchUsersParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QuerySearchUsersParametrizedInput properties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }

    public QuerySearchUsersParametrizedInput filter(FilterInputDto filter) {
        this.filter = filter;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        return joiner.toString();
    }

}
