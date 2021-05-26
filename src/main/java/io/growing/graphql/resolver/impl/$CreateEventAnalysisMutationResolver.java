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
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateEventAnalysisMutationResolver implements CreateEventAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateEventAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateEventAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public EventAnalysisDto createEventAnalysis(String projectId, EventAnalysisInputDto eventAnalysis) throws Exception {
        CreateEventAnalysisMutationRequest request = new CreateEventAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "eventAnalysis");
        List<?> values = Arrays.asList(projectId, eventAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventAnalysisResponseProjection projection = new EventAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateEventAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateEventAnalysisMutationResponse.class);
        return result.createEventAnalysis();
    }

}