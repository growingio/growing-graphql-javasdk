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
    date = "2020-12-22T15:45:58+0800"
)
final public class $CrystalBallUserInfoPanelsQueryResolver implements CrystalBallUserInfoPanelsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CrystalBallUserInfoPanelsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CrystalBallUserInfoPanelsQueryResolver() {}

    @Override
    public java.util.List<CrystalBallUserInfoPanelDto> crystalBallUserInfoPanels(String projectId) throws Exception {
        CrystalBallUserInfoPanelsQueryRequest request = new CrystalBallUserInfoPanelsQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CrystalBallUserInfoPanelResponseProjection projection = new CrystalBallUserInfoPanelResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CrystalBallUserInfoPanelsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CrystalBallUserInfoPanelsQueryResponse.class);
        return result.crystalBallUserInfoPanels();
    }

}