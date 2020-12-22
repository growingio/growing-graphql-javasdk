package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $UpdateEventAnalysisMutationResolver implements UpdateEventAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateEventAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateEventAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public EventAnalysisDto updateEventAnalysis(String projectId, String id, EventAnalysisInputDto eventAnalysis) throws Exception {
        UpdateEventAnalysisMutationRequest request = new UpdateEventAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "eventAnalysis");
        List<?> values = Arrays.asList(projectId, id, eventAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventAnalysisResponseProjection projection = new EventAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateEventAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateEventAnalysisMutationResponse.class);
        return result.updateEventAnalysis();
    }

}