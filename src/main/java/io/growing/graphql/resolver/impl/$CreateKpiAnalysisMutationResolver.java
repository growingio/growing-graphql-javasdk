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
final public class $CreateKpiAnalysisMutationResolver implements CreateKpiAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateKpiAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateKpiAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public KpiAnalysisDto createKpiAnalysis(String projectId, KpiAnalysisInputDto kpiAnalysis) throws Exception {
        CreateKpiAnalysisMutationRequest request = new CreateKpiAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "kpiAnalysis");
        List<?> values = Arrays.asList(projectId, kpiAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        KpiAnalysisResponseProjection projection = new KpiAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateKpiAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateKpiAnalysisMutationResponse.class);
        return result.createKpiAnalysis();
    }

}