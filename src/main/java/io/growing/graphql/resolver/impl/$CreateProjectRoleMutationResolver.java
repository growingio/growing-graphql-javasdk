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
final public class $CreateProjectRoleMutationResolver implements CreateProjectRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateProjectRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateProjectRoleMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ProjectRoleDto createProjectRole(String projectId, RoleInputDto role) throws Exception {
        CreateProjectRoleMutationRequest request = new CreateProjectRoleMutationRequest();
        List<String> keys = Arrays.asList("projectId", "role");
        List<?> values = Arrays.asList(projectId, role);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ProjectRoleResponseProjection projection = new ProjectRoleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateProjectRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateProjectRoleMutationResponse.class);
        return result.createProjectRole();
    }

}