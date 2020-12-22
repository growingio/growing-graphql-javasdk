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
final public class $BatchDeleteRetentionAnalysesMutationResolver implements BatchDeleteRetentionAnalysesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchDeleteRetentionAnalysesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchDeleteRetentionAnalysesMutationResolver() {}

    @Override
    public Boolean batchDeleteRetentionAnalyses(String projectId, java.util.List<String> ids) throws Exception {
        BatchDeleteRetentionAnalysesMutationRequest request = new BatchDeleteRetentionAnalysesMutationRequest();
        List<String> keys = Arrays.asList("projectId", "ids");
        List<?> values = Arrays.asList(projectId, ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteRetentionAnalysesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteRetentionAnalysesMutationResponse.class);
        return result.batchDeleteRetentionAnalyses();
    }

}