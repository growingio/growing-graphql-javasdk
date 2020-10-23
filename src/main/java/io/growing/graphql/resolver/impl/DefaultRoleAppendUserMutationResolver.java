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
final public class DefaultRoleAppendUserMutationResolver implements RoleAppendUserMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultRoleAppendUserMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultRoleAppendUserMutationResolver() {}

    @Override
    public Boolean roleAppendUser(String roleName, String userId) throws Exception {
        RoleAppendUserMutationRequest request = new RoleAppendUserMutationRequest();
        List<String> keys = Arrays.asList("roleName", "userId");
        List<?> values = Arrays.asList(roleName, userId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        RoleAppendUserMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, RoleAppendUserMutationResponse.class);
        return result.roleAppendUser();
    }

}