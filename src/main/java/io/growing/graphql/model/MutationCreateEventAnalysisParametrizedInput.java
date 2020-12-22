package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createEventAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationCreateEventAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private EventAnalysisInputDto eventAnalysis;

    public MutationCreateEventAnalysisParametrizedInput() {
    }

    public MutationCreateEventAnalysisParametrizedInput(String projectId, EventAnalysisInputDto eventAnalysis) {
        this.projectId = projectId;
        this.eventAnalysis = eventAnalysis;
    }

    public MutationCreateEventAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationCreateEventAnalysisParametrizedInput eventAnalysis(EventAnalysisInputDto eventAnalysis) {
        this.eventAnalysis = eventAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (eventAnalysis != null) {
            joiner.add("eventAnalysis: " + GraphQLRequestSerializer.getEntry(eventAnalysis));
        }
        return joiner.toString();
    }

}
