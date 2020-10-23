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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultUpdateItemModelMutationResolver implements UpdateItemModelMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateItemModelMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateItemModelMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ItemModelDto updateItemModel(String id, ItemModelInputDto itemModel) throws Exception {
        UpdateItemModelMutationRequest request = new UpdateItemModelMutationRequest();
        List<String> keys = Arrays.asList("id", "itemModel");
        List<?> values = Arrays.asList(id, itemModel);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ItemModelResponseProjection projection = new ItemModelResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateItemModelMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateItemModelMutationResponse.class);
        return result.updateItemModel();
    }

}