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
final public class $UpdateDataCenterRoleMutationResolver implements UpdateDataCenterRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDataCenterRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDataCenterRoleMutationResolver() {}

    @Override
    public Boolean updateDataCenterRole(String id, RoleInputDto role) throws Exception {
        UpdateDataCenterRoleMutationRequest request = new UpdateDataCenterRoleMutationRequest();
        List<String> keys = Arrays.asList("id", "role");
        List<?> values = Arrays.asList(id, role);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateDataCenterRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDataCenterRoleMutationResponse.class);
        return result.updateDataCenterRole();
    }

}