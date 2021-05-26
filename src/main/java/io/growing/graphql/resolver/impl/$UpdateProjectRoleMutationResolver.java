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
final public class $UpdateProjectRoleMutationResolver implements UpdateProjectRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateProjectRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateProjectRoleMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateProjectRole(String projectId, String id, RoleInputDto role) throws Exception {
        UpdateProjectRoleMutationRequest request = new UpdateProjectRoleMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "role");
        List<?> values = Arrays.asList(projectId, id, role);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateProjectRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateProjectRoleMutationResponse.class);
        return result.updateProjectRole();
    }

}