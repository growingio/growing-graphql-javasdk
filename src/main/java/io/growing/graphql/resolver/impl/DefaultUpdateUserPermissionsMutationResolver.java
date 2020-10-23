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
final public class DefaultUpdateUserPermissionsMutationResolver implements UpdateUserPermissionsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateUserPermissionsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateUserPermissionsMutationResolver() {}

    @Override
    public Boolean updateUserPermissions(String userId, String roleId, java.util.List<String> permissions) throws Exception {
        UpdateUserPermissionsMutationRequest request = new UpdateUserPermissionsMutationRequest();
        List<String> keys = Arrays.asList("userId", "roleId", "permissions");
        List<?> values = Arrays.asList(userId, roleId, permissions);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateUserPermissionsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateUserPermissionsMutationResponse.class);
        return result.updateUserPermissions();
    }

}