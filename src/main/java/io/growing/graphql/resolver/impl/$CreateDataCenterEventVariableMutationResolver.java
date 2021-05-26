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
 * 数据中心 创建事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateDataCenterEventVariableMutationResolver implements CreateDataCenterEventVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterEventVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterEventVariableMutationResolver() {}

    /**
     * 数据中心 创建事件变量
     */
    @javax.validation.constraints.NotNull
    @Override
    public EventVariableDto createDataCenterEventVariable(VariableInputDto eventVariable) throws Exception {
        CreateDataCenterEventVariableMutationRequest request = new CreateDataCenterEventVariableMutationRequest();
        List<String> keys = Arrays.asList("eventVariable");
        List<?> values = Arrays.asList(eventVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventVariableResponseProjection projection = new EventVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterEventVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterEventVariableMutationResponse.class);
        return result.createDataCenterEventVariable();
    }

}