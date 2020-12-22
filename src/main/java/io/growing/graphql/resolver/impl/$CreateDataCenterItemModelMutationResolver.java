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

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $CreateDataCenterItemModelMutationResolver implements CreateDataCenterItemModelMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterItemModelMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterItemModelMutationResolver() {}

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