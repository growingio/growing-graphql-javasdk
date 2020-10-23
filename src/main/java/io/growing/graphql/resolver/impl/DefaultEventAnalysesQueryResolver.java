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
final public class DefaultEventAnalysesQueryResolver implements EventAnalysesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultEventAnalysesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultEventAnalysesQueryResolver() {}

    @Override
    public java.util.List<EventAnalysisDto> eventAnalyses() throws Exception {
        EventAnalysesQueryRequest request = new EventAnalysesQueryRequest();
        EventAnalysisResponseProjection projection = new EventAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        EventAnalysesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, EventAnalysesQueryResponse.class);
        return result.eventAnalyses();
    }

}