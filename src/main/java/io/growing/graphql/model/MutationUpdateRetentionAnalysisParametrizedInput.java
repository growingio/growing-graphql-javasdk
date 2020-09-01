package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateRetentionAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class MutationUpdateRetentionAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private RetentionAnalysisInputDto retentionAnalysis;

    public MutationUpdateRetentionAnalysisParametrizedInput() {
    }

    public MutationUpdateRetentionAnalysisParametrizedInput(String id, RetentionAnalysisInputDto retentionAnalysis) {
        this.id = id;
        this.retentionAnalysis = retentionAnalysis;
    }

    public MutationUpdateRetentionAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateRetentionAnalysisParametrizedInput retentionAnalysis(RetentionAnalysisInputDto retentionAnalysis) {
        this.retentionAnalysis = retentionAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (retentionAnalysis != null) {
            joiner.add("retentionAnalysis: " + GraphQLRequestSerializer.getEntry(retentionAnalysis));
        }
        return joiner.toString();
    }

}
