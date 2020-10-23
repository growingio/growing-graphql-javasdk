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
final public class DefaultBatchUpdateResourceAclMutationResolver implements BatchUpdateResourceAclMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultBatchUpdateResourceAclMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultBatchUpdateResourceAclMutationResolver() {}

    @Override
    public Boolean batchUpdateResourceAcl(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors) throws Exception {
        BatchUpdateResourceAclMutationRequest request = new BatchUpdateResourceAclMutationRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceIds", "readers", "editors");
        List<?> values = Arrays.asList(resourceType, resourceIds, readers, editors);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchUpdateResourceAclMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchUpdateResourceAclMutationResponse.class);
        return result.batchUpdateResourceAcl();
    }

}