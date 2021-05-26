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
 * 数据中心 批量删除物品模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $BatchDeleteDataCenterItemModelsMutationResolver implements BatchDeleteDataCenterItemModelsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchDeleteDataCenterItemModelsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchDeleteDataCenterItemModelsMutationResolver() {}

    /**
     * 数据中心 批量删除物品模型
     */
    @Override
    public Boolean batchDeleteDataCenterItemModels(java.util.List<String> ids) throws Exception {
        BatchDeleteDataCenterItemModelsMutationRequest request = new BatchDeleteDataCenterItemModelsMutationRequest();
        List<String> keys = Arrays.asList("ids");
        List<?> values = Arrays.asList(ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteDataCenterItemModelsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteDataCenterItemModelsMutationResponse.class);
        return result.batchDeleteDataCenterItemModels();
    }

}