package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userPermissionModules in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class QueryUserPermissionModulesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String userId;

    public QueryUserPermissionModulesParametrizedInput() {
    }

    public QueryUserPermissionModulesParametrizedInput(String userId) {
        this.userId = userId;
    }

    public QueryUserPermissionModulesParametrizedInput userId(String userId) {
        this.userId = userId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        return joiner.toString();
    }

}
