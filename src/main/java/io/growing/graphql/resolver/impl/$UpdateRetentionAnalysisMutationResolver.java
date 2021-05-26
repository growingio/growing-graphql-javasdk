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
final public class $UpdateRetentionAnalysisMutationResolver implements UpdateRetentionAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateRetentionAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateRetentionAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public RetentionAnalysisDto updateRetentionAnalysis(String projectId, String id, RetentionAnalysisInputDto retentionAnalysis) throws Exception {
        UpdateRetentionAnalysisMutationRequest request = new UpdateRetentionAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "retentionAnalysis");
        List<?> values = Arrays.asList(projectId, id, retentionAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        RetentionAnalysisResponseProjection projection = new RetentionAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateRetentionAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateRetentionAnalysisMutationResponse.class);
        return result.updateRetentionAnalysis();
    }

}