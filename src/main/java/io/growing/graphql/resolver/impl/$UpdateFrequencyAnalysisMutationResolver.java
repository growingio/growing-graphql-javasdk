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
final public class $UpdateFrequencyAnalysisMutationResolver implements UpdateFrequencyAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateFrequencyAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateFrequencyAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public FrequencyAnalysisDto updateFrequencyAnalysis(String projectId, String id, FrequencyAnalysisInputDto frequencyAnalysis) throws Exception {
        UpdateFrequencyAnalysisMutationRequest request = new UpdateFrequencyAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "frequencyAnalysis");
        List<?> values = Arrays.asList(projectId, id, frequencyAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FrequencyAnalysisResponseProjection projection = new FrequencyAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateFrequencyAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateFrequencyAnalysisMutationResponse.class);
        return result.updateFrequencyAnalysis();
    }

}