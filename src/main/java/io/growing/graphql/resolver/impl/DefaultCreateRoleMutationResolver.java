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
final public class DefaultCreateRoleMutationResolver implements CreateRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateRoleMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public RoleDto createRole(RoleInputDto role) throws Exception {
        CreateRoleMutationRequest request = new CreateRoleMutationRequest();
        List<String> keys = Arrays.asList("role");
        List<?> values = Arrays.asList(role);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        RoleResponseProjection projection = new RoleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateRoleMutationResponse.class);
        return result.createRole();
    }

}