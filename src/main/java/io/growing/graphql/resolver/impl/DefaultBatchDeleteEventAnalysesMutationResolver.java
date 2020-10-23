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
final public class DefaultBatchDeleteEventAnalysesMutationResolver implements BatchDeleteEventAnalysesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultBatchDeleteEventAnalysesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultBatchDeleteEventAnalysesMutationResolver() {}

    @Override
    public Boolean batchDeleteEventAnalyses(java.util.List<String> ids) throws Exception {
        BatchDeleteEventAnalysesMutationRequest request = new BatchDeleteEventAnalysesMutationRequest();
        List<String> keys = Arrays.asList("ids");
        List<?> values = Arrays.asList(ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteEventAnalysesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteEventAnalysesMutationResponse.class);
        return result.batchDeleteEventAnalyses();
    }

}