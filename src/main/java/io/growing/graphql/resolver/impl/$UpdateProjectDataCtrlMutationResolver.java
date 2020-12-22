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
final public class $UpdateProjectDataCtrlMutationResolver implements UpdateProjectDataCtrlMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateProjectDataCtrlMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateProjectDataCtrlMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ProjectDataCtrlDto updateProjectDataCtrl(UpdateProjectDataCtrlInputDto input) throws Exception {
        UpdateProjectDataCtrlMutationRequest request = new UpdateProjectDataCtrlMutationRequest();
        List<String> keys = Arrays.asList("input");
        List<?> values = Arrays.asList(input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ProjectDataCtrlResponseProjection projection = new ProjectDataCtrlResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateProjectDataCtrlMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateProjectDataCtrlMutationResponse.class);
        return result.updateProjectDataCtrl();
    }

}