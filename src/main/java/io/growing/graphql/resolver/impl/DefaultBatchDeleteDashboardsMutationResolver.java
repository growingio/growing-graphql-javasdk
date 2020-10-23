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
final public class DefaultBatchDeleteDashboardsMutationResolver implements BatchDeleteDashboardsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultBatchDeleteDashboardsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultBatchDeleteDashboardsMutationResolver() {}

    @Override
    public Boolean batchDeleteDashboards(java.util.List<String> ids) throws Exception {
        BatchDeleteDashboardsMutationRequest request = new BatchDeleteDashboardsMutationRequest();
        List<String> keys = Arrays.asList("ids");
        List<?> values = Arrays.asList(ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteDashboardsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteDashboardsMutationResponse.class);
        return result.batchDeleteDashboards();
    }

}