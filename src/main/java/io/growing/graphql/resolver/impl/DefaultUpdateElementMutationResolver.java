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
final public class DefaultUpdateElementMutationResolver implements UpdateElementMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateElementMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateElementMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ElementDto updateElement(String id, ElementUpdateInputDto element) throws Exception {
        UpdateElementMutationRequest request = new UpdateElementMutationRequest();
        List<String> keys = Arrays.asList("id", "element");
        List<?> values = Arrays.asList(id, element);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ElementResponseProjection projection = new ElementResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateElementMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateElementMutationResponse.class);
        return result.updateElement();
    }

}