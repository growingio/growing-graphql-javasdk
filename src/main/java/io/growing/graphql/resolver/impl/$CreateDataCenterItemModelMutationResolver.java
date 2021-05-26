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
 * 数据中心 创建物品模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateDataCenterItemModelMutationResolver implements CreateDataCenterItemModelMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterItemModelMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterItemModelMutationResolver() {}

    /**
     * 数据中心 创建物品模型
     */
    @javax.validation.constraints.NotNull
    @Override
    public ItemModelDto createDataCenterItemModel(ItemModelInputDto itemModel) throws Exception {
        CreateDataCenterItemModelMutationRequest request = new CreateDataCenterItemModelMutationRequest();
        List<String> keys = Arrays.asList("itemModel");
        List<?> values = Arrays.asList(itemModel);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ItemModelResponseProjection projection = new ItemModelResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterItemModelMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterItemModelMutationResponse.class);
        return result.createDataCenterItemModel();
    }

}