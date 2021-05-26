package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createOlapEventAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationCreateOlapEventAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private OlapEventAnalysisInputDto olapEventAnalysis;

    public MutationCreateOlapEventAnalysisParametrizedInput() {
    }

    public MutationCreateOlapEventAnalysisParametrizedInput(String projectId, OlapEventAnalysisInputDto olapEventAnalysis) {
        this.projectId = projectId;
        this.olapEventAnalysis = olapEventAnalysis;
    }

    public MutationCreateOlapEventAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateOlapEventAnalysisParametrizedInput olapEventAnalysis(OlapEventAnalysisInputDto olapEventAnalysis) {
        this.olapEventAnalysis = olapEventAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (olapEventAnalysis != null) {
            joiner.add("olapEventAnalysis: " + GraphQLRequestSerializer.getEntry(olapEventAnalysis));
        }
        return joiner.toString();
    }

}
