package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createProject in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateProjectParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private ProjectInputDto project;

    public MutationCreateProjectParametrizedInput() {
    }

    public MutationCreateProjectParametrizedInput(ProjectInputDto project) {
        this.project = project;
    }

    public MutationCreateProjectParametrizedInput project(ProjectInputDto project) {
        this.project = project;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        return joiner.toString();
    }

}
