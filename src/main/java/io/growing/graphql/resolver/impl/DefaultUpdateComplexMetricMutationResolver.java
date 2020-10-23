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
final public class DefaultUpdateComplexMetricMutationResolver implements UpdateComplexMetricMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateComplexMetricMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateComplexMetricMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ComplexMetricDto updateComplexMetric(String id, ComplexMetricInputDto complexMetric) throws Exception {
        UpdateComplexMetricMutationRequest request = new UpdateComplexMetricMutationRequest();
        List<String> keys = Arrays.asList("id", "complexMetric");
        List<?> values = Arrays.asList(id, complexMetric);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ComplexMetricResponseProjection projection = new ComplexMetricResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateComplexMetricMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateComplexMetricMutationResponse.class);
        return result.updateComplexMetric();
    }

}