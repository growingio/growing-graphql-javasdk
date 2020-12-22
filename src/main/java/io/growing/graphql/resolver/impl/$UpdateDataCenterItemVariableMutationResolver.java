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
final public class $UpdateDataCenterItemVariableMutationResolver implements UpdateDataCenterItemVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDataCenterItemVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDataCenterItemVariableMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ItemVariableDto updateDataCenterItemVariable(String id, VariableInputDto itemVariable) throws Exception {
        UpdateDataCenterItemVariableMutationRequest request = new UpdateDataCenterItemVariableMutationRequest();
        List<String> keys = Arrays.asList("id", "itemVariable");
        List<?> values = Arrays.asList(id, itemVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ItemVariableResponseProjection projection = new ItemVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateDataCenterItemVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDataCenterItemVariableMutationResponse.class);
        return result.updateDataCenterItemVariable();
    }

}