package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface UpdateEventAnalysisMutationResolver {

    @javax.validation.constraints.NotNull
    EventAnalysisDto updateEventAnalysis(String projectId, String id, EventAnalysisInputDto eventAnalysis) throws Exception;

}