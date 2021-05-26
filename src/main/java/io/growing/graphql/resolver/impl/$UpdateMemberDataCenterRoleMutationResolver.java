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
final public class $UpdateMemberDataCenterRoleMutationResolver implements UpdateMemberDataCenterRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateMemberDataCenterRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateMemberDataCenterRoleMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateMemberDataCenterRole(String memberId, String roleId) throws Exception {
        UpdateMemberDataCenterRoleMutationRequest request = new UpdateMemberDataCenterRoleMutationRequest();
        List<String> keys = Arrays.asList("memberId", "roleId");
        List<?> values = Arrays.asList(memberId, roleId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateMemberDataCenterRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateMemberDataCenterRoleMutationResponse.class);
        return result.updateMemberDataCenterRole();
    }

}