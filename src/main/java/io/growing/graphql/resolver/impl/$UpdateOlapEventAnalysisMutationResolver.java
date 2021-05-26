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
 * 更新新事件分析图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateOlapEventAnalysisMutationResolver implements UpdateOlapEventAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateOlapEventAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateOlapEventAnalysisMutationResolver() {}

    /**
     * 更新新事件分析图
     */
    @javax.validation.constraints.NotNull
    @Override
    public EventAnalysisDto updateOlapEventAnalysis(String projectId, String id, OlapEventAnalysisInputDto olapEventAnalysis) throws Exception {
        UpdateOlapEventAnalysisMutationRequest request = new UpdateOlapEventAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "olapEventAnalysis");
        List<?> values = Arrays.asList(projectId, id, olapEventAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventAnalysisResponseProjection projection = new EventAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateOlapEventAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateOlapEventAnalysisMutationResponse.class);
        return result.updateOlapEventAnalysis();
    }

}