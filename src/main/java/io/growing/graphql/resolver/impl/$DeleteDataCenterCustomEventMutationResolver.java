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
 * 数据中心 删除打点事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DeleteDataCenterCustomEventMutationResolver implements DeleteDataCenterCustomEventMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteDataCenterCustomEventMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteDataCenterCustomEventMutationResolver() {}

    /**
     * 数据中心 删除打点事件
     */
    @Override
    public Boolean deleteDataCenterCustomEvent(String id) throws Exception {
        DeleteDataCenterCustomEventMutationRequest request = new DeleteDataCenterCustomEventMutationRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteDataCenterCustomEventMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteDataCenterCustomEventMutationResponse.class);
        return result.deleteDataCenterCustomEvent();
    }

}