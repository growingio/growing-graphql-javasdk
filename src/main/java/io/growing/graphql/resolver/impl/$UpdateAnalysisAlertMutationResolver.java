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
 * 更新分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateAnalysisAlertMutationResolver implements UpdateAnalysisAlertMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateAnalysisAlertMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateAnalysisAlertMutationResolver() {}

    /**
     * 更新分析预警
     */
    @javax.validation.constraints.NotNull
    @Override
    public AnalysisAlertsDto updateAnalysisAlert(String projectId, String id, AnalysisAlertsInputDto analysisAlert) throws Exception {
        UpdateAnalysisAlertMutationRequest request = new UpdateAnalysisAlertMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "analysisAlert");
        List<?> values = Arrays.asList(projectId, id, analysisAlert);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AnalysisAlertsResponseProjection projection = new AnalysisAlertsResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateAnalysisAlertMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateAnalysisAlertMutationResponse.class);
        return result.updateAnalysisAlert();
    }

}