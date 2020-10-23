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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultCreateKpiAnalysisMutationResolver implements CreateKpiAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateKpiAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateKpiAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public KpiAnalysisDto createKpiAnalysis(KpiAnalysisInputDto kpiAnalysis) throws Exception {
        CreateKpiAnalysisMutationRequest request = new CreateKpiAnalysisMutationRequest();
        List<String> keys = Arrays.asList("kpiAnalysis");
        List<?> values = Arrays.asList(kpiAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        KpiAnalysisResponseProjection projection = new KpiAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateKpiAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateKpiAnalysisMutationResponse.class);
        return result.createKpiAnalysis();
    }

}