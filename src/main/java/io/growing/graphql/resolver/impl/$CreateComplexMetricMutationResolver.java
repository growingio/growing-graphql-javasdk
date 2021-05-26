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
 * 创建计算指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateComplexMetricMutationResolver implements CreateComplexMetricMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateComplexMetricMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateComplexMetricMutationResolver() {}

    /**
     * 创建计算指标
     */
    @javax.validation.constraints.NotNull
    @Override
    public ComplexMetricDto createComplexMetric(String projectId, ComplexMetricInputDto complexMetric) throws Exception {
        CreateComplexMetricMutationRequest request = new CreateComplexMetricMutationRequest();
        List<String> keys = Arrays.asList("projectId", "complexMetric");
        List<?> values = Arrays.asList(projectId, complexMetric);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ComplexMetricResponseProjection projection = new ComplexMetricResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateComplexMetricMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateComplexMetricMutationResponse.class);
        return result.createComplexMetric();
    }

}