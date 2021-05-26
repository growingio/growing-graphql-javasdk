package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userProjectPermissionModules in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryUserProjectPermissionModulesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String userId;

    public QueryUserProjectPermissionModulesParametrizedInput() {
    }

    public QueryUserProjectPermissionModulesParametrizedInput(String projectId, String userId) {
        this.projectId = projectId;
        this.userId = userId;
    }

    public QueryUserProjectPermissionModulesParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryUserProjectPermissionModulesParametrizedInput userId(String userId) {
        this.userId = userId;
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
        return joiner.toString();
    }

}
