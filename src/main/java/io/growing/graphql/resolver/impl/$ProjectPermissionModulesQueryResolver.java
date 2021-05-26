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
final public class $ProjectPermissionModulesQueryResolver implements ProjectPermissionModulesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $ProjectPermissionModulesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ProjectPermissionModulesQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<ModuleDto> projectPermissionModules() throws Exception {
        ProjectPermissionModulesQueryRequest request = new ProjectPermissionModulesQueryRequest();
        ModuleResponseProjection projection = new ModuleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ProjectPermissionModulesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ProjectPermissionModulesQueryResponse.class);
        return result.projectPermissionModules();
    }

}