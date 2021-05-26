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
final public class $DataCenterPermissionModulesQueryResolver implements DataCenterPermissionModulesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterPermissionModulesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterPermissionModulesQueryResolver() {}

    @Override
    public java.util.List<ModuleDto> dataCenterPermissionModules() throws Exception {
        DataCenterPermissionModulesQueryRequest request = new DataCenterPermissionModulesQueryRequest();
        ModuleResponseProjection projection = new ModuleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterPermissionModulesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterPermissionModulesQueryResponse.class);
        return result.dataCenterPermissionModules();
    }

}