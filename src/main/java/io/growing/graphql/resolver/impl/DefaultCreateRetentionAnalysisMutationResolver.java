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
final public class DefaultCreateRetentionAnalysisMutationResolver implements CreateRetentionAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateRetentionAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateRetentionAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public RetentionAnalysisDto createRetentionAnalysis(RetentionAnalysisInputDto retentionAnalysis) throws Exception {
        CreateRetentionAnalysisMutationRequest request = new CreateRetentionAnalysisMutationRequest();
        List<String> keys = Arrays.asList("retentionAnalysis");
        List<?> values = Arrays.asList(retentionAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        RetentionAnalysisResponseProjection projection = new RetentionAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateRetentionAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateRetentionAnalysisMutationResponse.class);
        return result.createRetentionAnalysis();
    }

}