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
 * 创建新事件分析图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateOlapEventAnalysisMutationResolver implements CreateOlapEventAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateOlapEventAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateOlapEventAnalysisMutationResolver() {}

    /**
     * 创建新事件分析图
     */
    @javax.validation.constraints.NotNull
    @Override
    public EventAnalysisDto createOlapEventAnalysis(String projectId, OlapEventAnalysisInputDto olapEventAnalysis) throws Exception {
        CreateOlapEventAnalysisMutationRequest request = new CreateOlapEventAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "olapEventAnalysis");
        List<?> values = Arrays.asList(projectId, olapEventAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventAnalysisResponseProjection projection = new EventAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateOlapEventAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateOlapEventAnalysisMutationResponse.class);
        return result.createOlapEventAnalysis();
    }

}