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
 * 数据中心 批量删除打点事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $BatchDeleteDataCenterCustomEventsMutationResolver implements BatchDeleteDataCenterCustomEventsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchDeleteDataCenterCustomEventsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchDeleteDataCenterCustomEventsMutationResolver() {}

    /**
     * 数据中心 批量删除打点事件
     */
    @Override
    public Boolean batchDeleteDataCenterCustomEvents(java.util.List<String> ids) throws Exception {
        BatchDeleteDataCenterCustomEventsMutationRequest request = new BatchDeleteDataCenterCustomEventsMutationRequest();
        List<String> keys = Arrays.asList("ids");
        List<?> values = Arrays.asList(ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteDataCenterCustomEventsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteDataCenterCustomEventsMutationResponse.class);
        return result.batchDeleteDataCenterCustomEvents();
    }

}