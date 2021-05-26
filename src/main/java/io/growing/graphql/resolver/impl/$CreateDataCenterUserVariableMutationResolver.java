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
 * 数据中心 创建用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateDataCenterUserVariableMutationResolver implements CreateDataCenterUserVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterUserVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterUserVariableMutationResolver() {}

    /**
     * 数据中心 创建用户属性
     */
    @javax.validation.constraints.NotNull
    @Override
    public UserVariableDto createDataCenterUserVariable(VariableInputDto userVariable) throws Exception {
        CreateDataCenterUserVariableMutationRequest request = new CreateDataCenterUserVariableMutationRequest();
        List<String> keys = Arrays.asList("userVariable");
        List<?> values = Arrays.asList(userVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserVariableResponseProjection projection = new UserVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterUserVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterUserVariableMutationResponse.class);
        return result.createDataCenterUserVariable();
    }

}