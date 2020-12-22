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
final public class $AddMembersToDataCenterRoleMutationResolver implements AddMembersToDataCenterRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $AddMembersToDataCenterRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AddMembersToDataCenterRoleMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean addMembersToDataCenterRole(java.util.List<String> memberIds, String roleId) throws Exception {
        AddMembersToDataCenterRoleMutationRequest request = new AddMembersToDataCenterRoleMutationRequest();
        List<String> keys = Arrays.asList("memberIds", "roleId");
        List<?> values = Arrays.asList(memberIds, roleId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        AddMembersToDataCenterRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AddMembersToDataCenterRoleMutationResponse.class);
        return result.addMembersToDataCenterRole();
    }

}