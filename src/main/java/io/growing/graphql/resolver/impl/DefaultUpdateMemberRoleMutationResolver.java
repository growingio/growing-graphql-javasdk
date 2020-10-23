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
final public class DefaultUpdateMemberRoleMutationResolver implements UpdateMemberRoleMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateMemberRoleMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateMemberRoleMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateMemberRole(String memberId, String roleId) throws Exception {
        UpdateMemberRoleMutationRequest request = new UpdateMemberRoleMutationRequest();
        List<String> keys = Arrays.asList("memberId", "roleId");
        List<?> values = Arrays.asList(memberId, roleId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateMemberRoleMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateMemberRoleMutationResponse.class);
        return result.updateMemberRole();
    }

}