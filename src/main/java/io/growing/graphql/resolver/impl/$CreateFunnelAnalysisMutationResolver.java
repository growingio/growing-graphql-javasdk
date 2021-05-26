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
final public class $CreateFunnelAnalysisMutationResolver implements CreateFunnelAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateFunnelAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateFunnelAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public FunnelAnalysisDto createFunnelAnalysis(String projectId, FunnelAnalysisInputDto funnelAnalysis) throws Exception {
        CreateFunnelAnalysisMutationRequest request = new CreateFunnelAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "funnelAnalysis");
        List<?> values = Arrays.asList(projectId, funnelAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FunnelAnalysisResponseProjection projection = new FunnelAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateFunnelAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateFunnelAnalysisMutationResponse.class);
        return result.createFunnelAnalysis();
    }

}