package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createRetentionAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class MutationCreateRetentionAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private RetentionAnalysisInputDto retentionAnalysis;

    public MutationCreateRetentionAnalysisParametrizedInput() {
    }

    public MutationCreateRetentionAnalysisParametrizedInput(RetentionAnalysisInputDto retentionAnalysis) {
        this.retentionAnalysis = retentionAnalysis;
    }

    public MutationCreateRetentionAnalysisParametrizedInput retentionAnalysis(RetentionAnalysisInputDto retentionAnalysis) {
        this.retentionAnalysis = retentionAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (retentionAnalysis != null) {
            joiner.add("retentionAnalysis: " + GraphQLRequestSerializer.getEntry(retentionAnalysis));
        }
        return joiner.toString();
    }

}
