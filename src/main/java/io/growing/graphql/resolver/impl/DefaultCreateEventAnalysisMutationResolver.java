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
final public class DefaultCreateEventAnalysisMutationResolver implements CreateEventAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateEventAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateEventAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public EventAnalysisDto createEventAnalysis(EventAnalysisInputDto eventAnalysis) throws Exception {
        CreateEventAnalysisMutationRequest request = new CreateEventAnalysisMutationRequest();
        List<String> keys = Arrays.asList("eventAnalysis");
        List<?> values = Arrays.asList(eventAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventAnalysisResponseProjection projection = new EventAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateEventAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateEventAnalysisMutationResponse.class);
        return result.createEventAnalysis();
    }

}