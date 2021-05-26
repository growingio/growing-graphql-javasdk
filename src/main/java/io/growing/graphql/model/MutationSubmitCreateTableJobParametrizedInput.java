package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitCreateTableJob in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationSubmitCreateTableJobParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private CreateTableJobParameterInputDto parameter;

    public MutationSubmitCreateTableJobParametrizedInput() {
    }

    public MutationSubmitCreateTableJobParametrizedInput(String projectId, CreateTableJobParameterInputDto parameter) {
        this.projectId = projectId;
        this.parameter = parameter;
    }

    public MutationSubmitCreateTableJobParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationSubmitCreateTableJobParametrizedInput parameter(CreateTableJobParameterInputDto parameter) {
        this.parameter = parameter;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (parameter != null) {
            joiner.add("parameter: " + GraphQLRequestSerializer.getEntry(parameter));
        }
        return joiner.toString();
    }

}
