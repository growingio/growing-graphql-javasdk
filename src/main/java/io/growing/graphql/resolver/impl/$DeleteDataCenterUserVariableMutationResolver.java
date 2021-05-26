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
 * 数据中心 删除用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DeleteDataCenterUserVariableMutationResolver implements DeleteDataCenterUserVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteDataCenterUserVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteDataCenterUserVariableMutationResolver() {}

    /**
     * 数据中心 删除用户属性
     */
    @javax.validation.constraints.NotNull
    @Override
    public Boolean deleteDataCenterUserVariable(String id) throws Exception {
        DeleteDataCenterUserVariableMutationRequest request = new DeleteDataCenterUserVariableMutationRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteDataCenterUserVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteDataCenterUserVariableMutationResponse.class);
        return result.deleteDataCenterUserVariable();
    }

}