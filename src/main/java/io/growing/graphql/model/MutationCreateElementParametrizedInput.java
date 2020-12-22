package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createElement in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateElementParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private ElementInputDto element;

    public MutationCreateElementParametrizedInput() {
    }

    public MutationCreateElementParametrizedInput(String projectId, ElementInputDto element) {
        this.projectId = projectId;
        this.element = element;
    }

    public MutationCreateElementParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateElementParametrizedInput element(ElementInputDto element) {
        this.element = element;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (element != null) {
            joiner.add("element: " + GraphQLRequestSerializer.getEntry(element));
        }
        return joiner.toString();
    }

}
