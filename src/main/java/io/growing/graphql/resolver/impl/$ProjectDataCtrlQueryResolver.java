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
final public class $ProjectDataCtrlQueryResolver implements ProjectDataCtrlQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $ProjectDataCtrlQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ProjectDataCtrlQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<ProjectDataCtrlDto> projectDataCtrl(String projectId) throws Exception {
        ProjectDataCtrlQueryRequest request = new ProjectDataCtrlQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ProjectDataCtrlResponseProjection projection = new ProjectDataCtrlResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ProjectDataCtrlQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ProjectDataCtrlQueryResponse.class);
        return result.projectDataCtrl();
    }

}