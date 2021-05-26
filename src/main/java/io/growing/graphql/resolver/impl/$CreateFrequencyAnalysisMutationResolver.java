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
final public class $CreateFrequencyAnalysisMutationResolver implements CreateFrequencyAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateFrequencyAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateFrequencyAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public FrequencyAnalysisDto createFrequencyAnalysis(String projectId, FrequencyAnalysisInputDto frequencyAnalysis) throws Exception {
        CreateFrequencyAnalysisMutationRequest request = new CreateFrequencyAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "frequencyAnalysis");
        List<?> values = Arrays.asList(projectId, frequencyAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FrequencyAnalysisResponseProjection projection = new FrequencyAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateFrequencyAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateFrequencyAnalysisMutationResponse.class);
        return result.createFrequencyAnalysis();
    }

}