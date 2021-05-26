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

/**
 * @deprecated
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterRoleAppendUserMutationResolver implements DataCenterRoleAppendUserMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterRoleAppendUserMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterRoleAppendUserMutationResolver() {}

    /**
     * @deprecated
     */
    @Override
    public Boolean dataCenterRoleAppendUser(String roleName, String userId) throws Exception {
        DataCenterRoleAppendUserMutationRequest request = new DataCenterRoleAppendUserMutationRequest();
        List<String> keys = Arrays.asList("roleName", "userId");
        List<?> values = Arrays.asList(roleName, userId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DataCenterRoleAppendUserMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterRoleAppendUserMutationResponse.class);
        return result.dataCenterRoleAppendUser();
    }

}