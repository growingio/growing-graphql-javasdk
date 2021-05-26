package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field batchDeleteFrequencyAnalyses in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationBatchDeleteFrequencyAnalysesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> ids;

    public MutationBatchDeleteFrequencyAnalysesParametrizedInput() {
    }

    public MutationBatchDeleteFrequencyAnalysesParametrizedInput(String projectId, java.util.List<String> ids) {
        this.projectId = projectId;
        this.ids = ids;
    }

    public MutationBatchDeleteFrequencyAnalysesParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationBatchDeleteFrequencyAnalysesParametrizedInput ids(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (ids != null) {
            joiner.add("ids: " + GraphQLRequestSerializer.getEntry(ids));
        }
        return joiner.toString();
    }

}
