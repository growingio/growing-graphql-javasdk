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
final public class $UpdateDataCenterResourceAclsMutationResolver implements UpdateDataCenterResourceAclsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDataCenterResourceAclsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDataCenterResourceAclsMutationResolver() {}

    @Override
    public Boolean updateDataCenterResourceAcls(String resourceType, String resourceId, AccessEntryInputDto accessEntry) throws Exception {
        UpdateDataCenterResourceAclsMutationRequest request = new UpdateDataCenterResourceAclsMutationRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceId", "accessEntry");
        List<?> values = Arrays.asList(resourceType, resourceId, accessEntry);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateDataCenterResourceAclsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDataCenterResourceAclsMutationResponse.class);
        return result.updateDataCenterResourceAcls();
    }

}