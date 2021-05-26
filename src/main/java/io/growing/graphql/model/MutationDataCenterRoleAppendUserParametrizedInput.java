package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterRoleAppendUser in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationDataCenterRoleAppendUserParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String roleName;
    @javax.validation.constraints.NotNull
    private String userId;

    public MutationDataCenterRoleAppendUserParametrizedInput() {
    }

    public MutationDataCenterRoleAppendUserParametrizedInput(String roleName, String userId) {
        this.roleName = roleName;
        this.userId = userId;
    }

    public MutationDataCenterRoleAppendUserParametrizedInput roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public MutationDataCenterRoleAppendUserParametrizedInput userId(String userId) {
        this.userId = userId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (roleName != null) {
            joiner.add("roleName: " + GraphQLRequestSerializer.getEntry(roleName));
        }
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        return joiner.toString();
    }

}
