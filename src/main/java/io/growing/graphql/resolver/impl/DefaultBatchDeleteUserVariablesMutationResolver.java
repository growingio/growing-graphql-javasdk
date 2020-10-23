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
final public class DefaultBatchDeleteUserVariablesMutationResolver implements BatchDeleteUserVariablesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultBatchDeleteUserVariablesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultBatchDeleteUserVariablesMutationResolver() {}

    @Override
    public Boolean batchDeleteUserVariables(java.util.List<String> ids) throws Exception {
        BatchDeleteUserVariablesMutationRequest request = new BatchDeleteUserVariablesMutationRequest();
        List<String> keys = Arrays.asList("ids");
        List<?> values = Arrays.asList(ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteUserVariablesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteUserVariablesMutationResponse.class);
        return result.batchDeleteUserVariables();
    }

}