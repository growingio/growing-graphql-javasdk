package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitSegmentUserExportJobV2 in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationSubmitSegmentUserExportJobV2ParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private ExportSegmentParameterInputDto parameter;

    public MutationSubmitSegmentUserExportJobV2ParametrizedInput() {
    }

    public MutationSubmitSegmentUserExportJobV2ParametrizedInput(String projectId, ExportSegmentParameterInputDto parameter) {
        this.projectId = projectId;
        this.parameter = parameter;
    }

    public MutationSubmitSegmentUserExportJobV2ParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationSubmitSegmentUserExportJobV2ParametrizedInput parameter(ExportSegmentParameterInputDto parameter) {
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
