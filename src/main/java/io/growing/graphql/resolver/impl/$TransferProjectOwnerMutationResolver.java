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
final public class $TransferProjectOwnerMutationResolver implements TransferProjectOwnerMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $TransferProjectOwnerMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TransferProjectOwnerMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean transferProjectOwner(TransferProjectOwnerInputDto input) throws Exception {
        TransferProjectOwnerMutationRequest request = new TransferProjectOwnerMutationRequest();
        List<String> keys = Arrays.asList("input");
        List<?> values = Arrays.asList(input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        TransferProjectOwnerMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TransferProjectOwnerMutationResponse.class);
        return result.transferProjectOwner();
    }

}