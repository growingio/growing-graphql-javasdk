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
final public class $UserProjectPermissionModulesQueryResolver implements UserProjectPermissionModulesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserProjectPermissionModulesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserProjectPermissionModulesQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<ModuleDto> userProjectPermissionModules(String projectId, String userId) throws Exception {
        UserProjectPermissionModulesQueryRequest request = new UserProjectPermissionModulesQueryRequest();
        List<String> keys = Arrays.asList("projectId", "userId");
        List<?> values = Arrays.asList(projectId, userId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ModuleResponseProjection projection = new ModuleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserProjectPermissionModulesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserProjectPermissionModulesQueryResponse.class);
        return result.userProjectPermissionModules();
    }

}