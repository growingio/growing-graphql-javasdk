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
final public class $UpdateWebHookStatusMutationResolver implements UpdateWebHookStatusMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateWebHookStatusMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateWebHookStatusMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateWebHookStatus(String id, String status) throws Exception {
        UpdateWebHookStatusMutationRequest request = new UpdateWebHookStatusMutationRequest();
        List<String> keys = Arrays.asList("id", "status");
        List<?> values = Arrays.asList(id, status);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateWebHookStatusMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateWebHookStatusMutationResponse.class);
        return result.updateWebHookStatus();
    }

}