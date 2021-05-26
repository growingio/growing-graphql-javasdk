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
 * 数据中心 更新事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateDataCenterEventVariableMutationResolver implements UpdateDataCenterEventVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateDataCenterEventVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateDataCenterEventVariableMutationResolver() {}

    /**
     * 数据中心 更新事件变量
     */
    @javax.validation.constraints.NotNull
    @Override
    public EventVariableDto updateDataCenterEventVariable(String id, VariableInputDto eventVariable) throws Exception {
        UpdateDataCenterEventVariableMutationRequest request = new UpdateDataCenterEventVariableMutationRequest();
        List<String> keys = Arrays.asList("id", "eventVariable");
        List<?> values = Arrays.asList(id, eventVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventVariableResponseProjection projection = new EventVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateDataCenterEventVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateDataCenterEventVariableMutationResponse.class);
        return result.updateDataCenterEventVariable();
    }

}