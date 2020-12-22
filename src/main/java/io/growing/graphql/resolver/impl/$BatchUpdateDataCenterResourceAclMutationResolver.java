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
final public class $BatchUpdateDataCenterResourceAclMutationResolver implements BatchUpdateDataCenterResourceAclMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchUpdateDataCenterResourceAclMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchUpdateDataCenterResourceAclMutationResolver() {}

    @Override
    public Boolean batchUpdateDataCenterResourceAcl(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors, String projectId) throws Exception {
        BatchUpdateDataCenterResourceAclMutationRequest request = new BatchUpdateDataCenterResourceAclMutationRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceIds", "readers", "editors", "projectId");
        List<?> values = Arrays.asList(resourceType, resourceIds, readers, editors, projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchUpdateDataCenterResourceAclMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchUpdateDataCenterResourceAclMutationResponse.class);
        return result.batchUpdateDataCenterResourceAcl();
    }

}