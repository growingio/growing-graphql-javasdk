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
final public class $CreateRetentionDrillDownSegmentSnapshotMutationResolver implements CreateRetentionDrillDownSegmentSnapshotMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateRetentionDrillDownSegmentSnapshotMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateRetentionDrillDownSegmentSnapshotMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DrillDownSegmentSnapshotReplyDto createRetentionDrillDownSegmentSnapshot(String projectId, RetentionDrillDownSegmentInputDto retentionDrillDownSegment) throws Exception {
        CreateRetentionDrillDownSegmentSnapshotMutationRequest request = new CreateRetentionDrillDownSegmentSnapshotMutationRequest();
        List<String> keys = Arrays.asList("projectId", "retentionDrillDownSegment");
        List<?> values = Arrays.asList(projectId, retentionDrillDownSegment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DrillDownSegmentSnapshotReplyResponseProjection projection = new DrillDownSegmentSnapshotReplyResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateRetentionDrillDownSegmentSnapshotMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateRetentionDrillDownSegmentSnapshotMutationResponse.class);
        return result.createRetentionDrillDownSegmentSnapshot();
    }

}