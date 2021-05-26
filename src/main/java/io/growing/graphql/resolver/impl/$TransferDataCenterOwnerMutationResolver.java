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
final public class $TransferDataCenterOwnerMutationResolver implements TransferDataCenterOwnerMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $TransferDataCenterOwnerMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TransferDataCenterOwnerMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean transferDataCenterOwner(String transfereeId) throws Exception {
        TransferDataCenterOwnerMutationRequest request = new TransferDataCenterOwnerMutationRequest();
        List<String> keys = Arrays.asList("transfereeId");
        List<?> values = Arrays.asList(transfereeId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        TransferDataCenterOwnerMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TransferDataCenterOwnerMutationResponse.class);
        return result.transferDataCenterOwner();
    }

}