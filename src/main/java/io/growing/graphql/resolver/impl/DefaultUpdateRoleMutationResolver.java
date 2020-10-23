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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultUpdateRoleMutationResolver implements UpdateRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateRoleMutationResolver() {}

    @Override
    public Boolean updateRole(String id, RoleInputDto role) throws Exception {
        UpdateRoleMutationRequest request = new UpdateRoleMutationRequest();
        List<String> keys = Arrays.asList("id", "role");
        List<?> values = Arrays.asList(id, role);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateRoleMutationResponse.class);
        return result.updateRole();
    }

}