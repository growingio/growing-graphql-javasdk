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

/**
 * 数据中心 更新物品变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateDataCenterItemVariableMutationResolver implements UpdateDataCenterItemVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDataCenterItemVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDataCenterItemVariableMutationResolver() {}

    /**
     * 数据中心 更新物品变量
     */
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