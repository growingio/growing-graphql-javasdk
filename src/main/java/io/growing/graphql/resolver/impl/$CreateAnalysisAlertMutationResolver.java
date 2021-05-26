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

/**
 * 创建分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateAnalysisAlertMutationResolver implements CreateAnalysisAlertMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateAnalysisAlertMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateAnalysisAlertMutationResolver() {}

    /**
     * 创建分析预警
     */
    @javax.validation.constraints.NotNull
    @Override
    public AnalysisAlertsDto createAnalysisAlert(String projectId, AnalysisAlertsInputDto analysisAlert) throws Exception {
        CreateAnalysisAlertMutationRequest request = new CreateAnalysisAlertMutationRequest();
        List<String> keys = Arrays.asList("projectId", "analysisAlert");
        List<?> values = Arrays.asList(projectId, analysisAlert);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AnalysisAlertsResponseProjection projection = new AnalysisAlertsResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateAnalysisAlertMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateAnalysisAlertMutationResponse.class);
        return result.createAnalysisAlert();
    }

}