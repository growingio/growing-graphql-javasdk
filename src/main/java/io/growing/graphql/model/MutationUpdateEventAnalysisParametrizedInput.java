package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field updateEventAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationUpdateEventAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private EventAnalysisInputDto eventAnalysis;

    public MutationUpdateEventAnalysisParametrizedInput() {
    }

    public MutationUpdateEventAnalysisParametrizedInput(String projectId, String id, EventAnalysisInputDto eventAnalysis) {
        this.projectId = projectId;
        this.id = id;
        this.eventAnalysis = eventAnalysis;
    }

    public MutationUpdateEventAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationUpdateEventAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public MutationUpdateEventAnalysisParametrizedInput eventAnalysis(EventAnalysisInputDto eventAnalysis) {
        this.eventAnalysis = eventAnalysis;
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
        if (eventAnalysis != null) {
            joiner.add("eventAnalysis: " + GraphQLRequestSerializer.getEntry(eventAnalysis));
        }
        return joiner.toString();
    }

}
