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
 * 数据中心 删除事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DeleteDataCenterEventVariableMutationResolver implements DeleteDataCenterEventVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteDataCenterEventVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteDataCenterEventVariableMutationResolver() {}

    /**
     * 数据中心 删除事件变量
     */
    @javax.validation.constraints.NotNull
    @Override
    public Boolean deleteDataCenterEventVariable(String id) throws Exception {
        DeleteDataCenterEventVariableMutationRequest request = new DeleteDataCenterEventVariableMutationRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteDataCenterEventVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteDataCenterEventVariableMutationResponse.class);
        return result.deleteDataCenterEventVariable();
    }

}