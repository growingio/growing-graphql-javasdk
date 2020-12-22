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
final public class $UserDataCenterPermissionModulesQueryResolver implements UserDataCenterPermissionModulesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserDataCenterPermissionModulesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserDataCenterPermissionModulesQueryResolver() {}

    @Override
    public java.util.List<ModuleDto> userDataCenterPermissionModules(String userId) throws Exception {
        UserDataCenterPermissionModulesQueryRequest request = new UserDataCenterPermissionModulesQueryRequest();
        List<String> keys = Arrays.asList("userId");
        List<?> values = Arrays.asList(userId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ModuleResponseProjection projection = new ModuleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserDataCenterPermissionModulesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserDataCenterPermissionModulesQueryResponse.class);
        return result.userDataCenterPermissionModules();
    }

}