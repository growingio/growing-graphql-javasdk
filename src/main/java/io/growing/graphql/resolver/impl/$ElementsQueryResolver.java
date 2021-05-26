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
 * 无埋点 元素列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $ElementsQueryResolver implements ElementsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $ElementsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ElementsQueryResolver() {}

    /**
     * 无埋点 元素列表
     */
    @Override
    public java.util.List<ElementDto> elements(String projectId) throws Exception {
        ElementsQueryRequest request = new ElementsQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ElementResponseProjection projection = new ElementResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ElementsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ElementsQueryResponse.class);
        return result.elements();
    }

}