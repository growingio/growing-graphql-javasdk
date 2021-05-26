package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitTagUserExportJobByKey in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationSubmitTagUserExportJobByKeyParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private TagUserExportJobByKeyInputDto parameter;

    public MutationSubmitTagUserExportJobByKeyParametrizedInput() {
    }

    public MutationSubmitTagUserExportJobByKeyParametrizedInput(TagUserExportJobByKeyInputDto parameter) {
        this.parameter = parameter;
    }

    public MutationSubmitTagUserExportJobByKeyParametrizedInput parameter(TagUserExportJobByKeyInputDto parameter) {
        this.parameter = parameter;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (parameter != null) {
            joiner.add("parameter: " + GraphQLRequestSerializer.getEntry(parameter));
        }
        return joiner.toString();
    }

}
