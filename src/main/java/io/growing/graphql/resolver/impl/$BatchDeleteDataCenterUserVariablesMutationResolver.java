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
 * 数据中心 更批量删除用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $BatchDeleteDataCenterUserVariablesMutationResolver implements BatchDeleteDataCenterUserVariablesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchDeleteDataCenterUserVariablesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchDeleteDataCenterUserVariablesMutationResolver() {}

    /**
     * 数据中心 更批量删除用户属性
     */
    @Override
    public Boolean batchDeleteDataCenterUserVariables(java.util.List<String> ids) throws Exception {
        BatchDeleteDataCenterUserVariablesMutationRequest request = new BatchDeleteDataCenterUserVariablesMutationRequest();
        List<String> keys = Arrays.asList("ids");
        List<?> values = Arrays.asList(ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteDataCenterUserVariablesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteDataCenterUserVariablesMutationResponse.class);
        return result.batchDeleteDataCenterUserVariables();
    }

}