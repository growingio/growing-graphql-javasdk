package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateDepartment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class MutationUpdateDepartmentParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private DepartmentInputDto department;

    public MutationUpdateDepartmentParametrizedInput() {
    }

    public MutationUpdateDepartmentParametrizedInput(String id, DepartmentInputDto department) {
        this.id = id;
        this.department = department;
    }

    public MutationUpdateDepartmentParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateDepartmentParametrizedInput department(DepartmentInputDto department) {
        this.department = department;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (department != null) {
            joiner.add("department: " + GraphQLRequestSerializer.getEntry(department));
        }
        return joiner.toString();
    }

}
