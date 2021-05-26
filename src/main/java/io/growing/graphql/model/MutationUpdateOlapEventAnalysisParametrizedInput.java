package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateOlapEventAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationUpdateOlapEventAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private OlapEventAnalysisInputDto olapEventAnalysis;

    public MutationUpdateOlapEventAnalysisParametrizedInput() {
    }

    public MutationUpdateOlapEventAnalysisParametrizedInput(String projectId, String id, OlapEventAnalysisInputDto olapEventAnalysis) {
        this.projectId = projectId;
        this.id = id;
        this.olapEventAnalysis = olapEventAnalysis;
    }

    public MutationUpdateOlapEventAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationUpdateOlapEventAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateOlapEventAnalysisParametrizedInput olapEventAnalysis(OlapEventAnalysisInputDto olapEventAnalysis) {
        this.olapEventAnalysis = olapEventAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (olapEventAnalysis != null) {
            joiner.add("olapEventAnalysis: " + GraphQLRequestSerializer.getEntry(olapEventAnalysis));
        }
        return joiner.toString();
    }

}
