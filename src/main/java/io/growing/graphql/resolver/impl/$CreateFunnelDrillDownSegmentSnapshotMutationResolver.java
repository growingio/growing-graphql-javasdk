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
    date = "2021-05-26T15:01:24+0800"
)
final public class $CreateFunnelDrillDownSegmentSnapshotMutationResolver implements CreateFunnelDrillDownSegmentSnapshotMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateFunnelDrillDownSegmentSnapshotMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateFunnelDrillDownSegmentSnapshotMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DrillDownSegmentSnapshotReplyDto createFunnelDrillDownSegmentSnapshot(String projectId, FunnelDrillDownSegmentInputDto funnelDrillDownSegment) throws Exception {
        CreateFunnelDrillDownSegmentSnapshotMutationRequest request = new CreateFunnelDrillDownSegmentSnapshotMutationRequest();
        List<String> keys = Arrays.asList("projectId", "funnelDrillDownSegment");
        List<?> values = Arrays.asList(projectId, funnelDrillDownSegment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DrillDownSegmentSnapshotReplyResponseProjection projection = new DrillDownSegmentSnapshotReplyResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateFunnelDrillDownSegmentSnapshotMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateFunnelDrillDownSegmentSnapshotMutationResponse.class);
        return result.createFunnelDrillDownSegmentSnapshot();
    }

}