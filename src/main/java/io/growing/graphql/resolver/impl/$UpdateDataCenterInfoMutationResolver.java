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
final public class $UpdateDataCenterInfoMutationResolver implements UpdateDataCenterInfoMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDataCenterInfoMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDataCenterInfoMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateDataCenterInfo(DataCenterInfoInputDto dataCenterInfo) throws Exception {
        UpdateDataCenterInfoMutationRequest request = new UpdateDataCenterInfoMutationRequest();
        List<String> keys = Arrays.asList("dataCenterInfo");
        List<?> values = Arrays.asList(dataCenterInfo);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateDataCenterInfoMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDataCenterInfoMutationResponse.class);
        return result.updateDataCenterInfo();
    }

}