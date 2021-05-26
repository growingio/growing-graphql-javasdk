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
final public class $CreateRetentionAnalysisMutationResolver implements CreateRetentionAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateRetentionAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateRetentionAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public RetentionAnalysisDto createRetentionAnalysis(String projectId, RetentionAnalysisInputDto retentionAnalysis) throws Exception {
        CreateRetentionAnalysisMutationRequest request = new CreateRetentionAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "retentionAnalysis");
        List<?> values = Arrays.asList(projectId, retentionAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        RetentionAnalysisResponseProjection projection = new RetentionAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateRetentionAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateRetentionAnalysisMutationResponse.class);
        return result.createRetentionAnalysis();
    }

}