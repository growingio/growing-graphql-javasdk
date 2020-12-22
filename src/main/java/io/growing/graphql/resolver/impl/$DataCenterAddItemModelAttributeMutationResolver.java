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
final public class $DataCenterAddItemModelAttributeMutationResolver implements DataCenterAddItemModelAttributeMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterAddItemModelAttributeMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterAddItemModelAttributeMutationResolver() {}

    @Override
    public ItemVariableDto dataCenterAddItemModelAttribute(String id, ItemVariableInputDto attribute) throws Exception {
        DataCenterAddItemModelAttributeMutationRequest request = new DataCenterAddItemModelAttributeMutationRequest();
        List<String> keys = Arrays.asList("id", "attribute");
        List<?> values = Arrays.asList(id, attribute);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ItemVariableResponseProjection projection = new ItemVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterAddItemModelAttributeMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterAddItemModelAttributeMutationResponse.class);
        return result.dataCenterAddItemModelAttribute();
    }

}