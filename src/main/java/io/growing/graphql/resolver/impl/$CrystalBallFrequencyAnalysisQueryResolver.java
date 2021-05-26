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
final public class $CrystalBallFrequencyAnalysisQueryResolver implements CrystalBallFrequencyAnalysisQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CrystalBallFrequencyAnalysisQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CrystalBallFrequencyAnalysisQueryResolver() {}

    @Override
    public FrequencyAnalysisDto crystalBallFrequencyAnalysis(String projectId, String id) throws Exception {
        CrystalBallFrequencyAnalysisQueryRequest request = new CrystalBallFrequencyAnalysisQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FrequencyAnalysisResponseProjection projection = new FrequencyAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CrystalBallFrequencyAnalysisQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CrystalBallFrequencyAnalysisQueryResponse.class);
        return result.crystalBallFrequencyAnalysis();
    }

}