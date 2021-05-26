package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field userDataCenterPermissionModules in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryUserDataCenterPermissionModulesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String userId;

    public QueryUserDataCenterPermissionModulesParametrizedInput() {
    }

    public QueryUserDataCenterPermissionModulesParametrizedInput(String userId) {
        this.userId = userId;
    }

    public QueryUserDataCenterPermissionModulesParametrizedInput userId(String userId) {
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
