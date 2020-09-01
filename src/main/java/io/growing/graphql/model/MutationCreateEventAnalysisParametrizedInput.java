package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createEventAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class MutationCreateEventAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private EventAnalysisInputDto eventAnalysis;

    public MutationCreateEventAnalysisParametrizedInput() {
    }

    public MutationCreateEventAnalysisParametrizedInput(EventAnalysisInputDto eventAnalysis) {
        this.eventAnalysis = eventAnalysis;
    }

    public MutationCreateEventAnalysisParametrizedInput eventAnalysis(EventAnalysisInputDto eventAnalysis) {
        this.eventAnalysis = eventAnalysis;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (eventAnalysis != null) {
            joiner.add("eventAnalysis: " + GraphQLRequestSerializer.getEntry(eventAnalysis));
        }
        return joiner.toString();
    }

}
