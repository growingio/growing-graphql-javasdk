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
final public class DefaultUpdateResourceAclsMutationResolver implements UpdateResourceAclsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateResourceAclsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateResourceAclsMutationResolver() {}

    @Override
    public Boolean updateResourceAcls(String resourceType, String resourceId, AccessEntryInputDto accessEntry) throws Exception {
        UpdateResourceAclsMutationRequest request = new UpdateResourceAclsMutationRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceId", "accessEntry");
        List<?> values = Arrays.asList(resourceType, resourceId, accessEntry);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateResourceAclsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateResourceAclsMutationResponse.class);
        return result.updateResourceAcls();
    }

}