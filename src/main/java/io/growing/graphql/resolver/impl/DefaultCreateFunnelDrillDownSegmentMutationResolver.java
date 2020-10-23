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
final public class DefaultCreateFunnelDrillDownSegmentMutationResolver implements CreateFunnelDrillDownSegmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateFunnelDrillDownSegmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateFunnelDrillDownSegmentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DrillDownSegmentReplyDto createFunnelDrillDownSegment(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) throws Exception {
        CreateFunnelDrillDownSegmentMutationRequest request = new CreateFunnelDrillDownSegmentMutationRequest();
        List<String> keys = Arrays.asList("funnelDrillDownSegment");
        List<?> values = Arrays.asList(funnelDrillDownSegment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DrillDownSegmentReplyResponseProjection projection = new DrillDownSegmentReplyResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateFunnelDrillDownSegmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateFunnelDrillDownSegmentMutationResponse.class);
        return result.createFunnelDrillDownSegment();
    }

}