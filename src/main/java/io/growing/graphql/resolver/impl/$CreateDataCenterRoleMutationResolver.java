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
final public class $CreateDataCenterRoleMutationResolver implements CreateDataCenterRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterRoleMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DataCenterRoleDto createDataCenterRole(RoleInputDto role) throws Exception {
        CreateDataCenterRoleMutationRequest request = new CreateDataCenterRoleMutationRequest();
        List<String> keys = Arrays.asList("role");
        List<?> values = Arrays.asList(role);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DataCenterRoleResponseProjection projection = new DataCenterRoleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterRoleMutationResponse.class);
        return result.createDataCenterRole();
    }

}