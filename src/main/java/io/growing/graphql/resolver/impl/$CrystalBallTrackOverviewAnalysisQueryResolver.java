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
final public class $CrystalBallTrackOverviewAnalysisQueryResolver implements CrystalBallTrackOverviewAnalysisQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CrystalBallTrackOverviewAnalysisQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CrystalBallTrackOverviewAnalysisQueryResolver() {}

    @Override
    public TrackOverviewAnalysisDto crystalBallTrackOverviewAnalysis(String projectId, String id) throws Exception {
        CrystalBallTrackOverviewAnalysisQueryRequest request = new CrystalBallTrackOverviewAnalysisQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TrackOverviewAnalysisResponseProjection projection = new TrackOverviewAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CrystalBallTrackOverviewAnalysisQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CrystalBallTrackOverviewAnalysisQueryResponse.class);
        return result.crystalBallTrackOverviewAnalysis();
    }

}