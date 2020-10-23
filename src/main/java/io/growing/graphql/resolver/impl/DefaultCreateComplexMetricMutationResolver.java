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
final public class DefaultCreateComplexMetricMutationResolver implements CreateComplexMetricMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateComplexMetricMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateComplexMetricMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ComplexMetricDto createComplexMetric(ComplexMetricInputDto complexMetric) throws Exception {
        CreateComplexMetricMutationRequest request = new CreateComplexMetricMutationRequest();
        List<String> keys = Arrays.asList("complexMetric");
        List<?> values = Arrays.asList(complexMetric);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ComplexMetricResponseProjection projection = new ComplexMetricResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateComplexMetricMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateComplexMetricMutationResponse.class);
        return result.createComplexMetric();
    }

}