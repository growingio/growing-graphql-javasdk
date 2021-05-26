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
 * 无埋点 创建元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateElementMutationResolver implements CreateElementMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateElementMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateElementMutationResolver() {}

    /**
     * 无埋点 创建元素
     */
    @javax.validation.constraints.NotNull
    @Override
    public ElementDto createElement(String projectId, ElementInputDto element) throws Exception {
        CreateElementMutationRequest request = new CreateElementMutationRequest();
        List<String> keys = Arrays.asList("projectId", "element");
        List<?> values = Arrays.asList(projectId, element);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ElementResponseProjection projection = new ElementResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateElementMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateElementMutationResponse.class);
        return result.createElement();
    }

}