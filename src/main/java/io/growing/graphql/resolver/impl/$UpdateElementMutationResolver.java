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
 * 无埋点 更新元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateElementMutationResolver implements UpdateElementMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateElementMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateElementMutationResolver() {}

    /**
     * 无埋点 更新元素
     */
    @javax.validation.constraints.NotNull
    @Override
    public ElementDto updateElement(String projectId, String id, ElementUpdateInputDto element) throws Exception {
        UpdateElementMutationRequest request = new UpdateElementMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "element");
        List<?> values = Arrays.asList(projectId, id, element);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ElementResponseProjection projection = new ElementResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateElementMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateElementMutationResponse.class);
        return result.updateElement();
    }

}