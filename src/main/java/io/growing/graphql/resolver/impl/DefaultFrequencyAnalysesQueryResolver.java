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
final public class DefaultFrequencyAnalysesQueryResolver implements FrequencyAnalysesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultFrequencyAnalysesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultFrequencyAnalysesQueryResolver() {}

    @Override
    public java.util.List<FrequencyAnalysisDto> frequencyAnalyses() throws Exception {
        FrequencyAnalysesQueryRequest request = new FrequencyAnalysesQueryRequest();
        FrequencyAnalysisResponseProjection projection = new FrequencyAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        FrequencyAnalysesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, FrequencyAnalysesQueryResponse.class);
        return result.frequencyAnalyses();
    }

}