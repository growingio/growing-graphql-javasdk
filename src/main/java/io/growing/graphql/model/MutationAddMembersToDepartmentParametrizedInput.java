package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field addMembersToDepartment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationAddMembersToDepartmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<String> memberIds;
    private String departmentId;

    public MutationAddMembersToDepartmentParametrizedInput() {
    }

    public MutationAddMembersToDepartmentParametrizedInput(java.util.List<String> memberIds, String departmentId) {
        this.memberIds = memberIds;
        this.departmentId = departmentId;
    }

    public MutationAddMembersToDepartmentParametrizedInput memberIds(java.util.List<String> memberIds) {
        this.memberIds = memberIds;
        return this;
    }

    public MutationAddMembersToDepartmentParametrizedInput departmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (memberIds != null) {
            joiner.add("memberIds: " + GraphQLRequestSerializer.getEntry(memberIds));
        }
        if (departmentId != null) {
            joiner.add("departmentId: " + GraphQLRequestSerializer.getEntry(departmentId));
        }
        return joiner.toString();
    }

}
