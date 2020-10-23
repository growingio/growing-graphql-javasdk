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
final public class DefaultCreateSegmentSnapshotMutationResolver implements CreateSegmentSnapshotMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateSegmentSnapshotMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateSegmentSnapshotMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SegmentSnapshotDto createSegmentSnapshot(ComputeDefinitionInputDto compute) throws Exception {
        CreateSegmentSnapshotMutationRequest request = new CreateSegmentSnapshotMutationRequest();
        List<String> keys = Arrays.asList("compute");
        List<?> values = Arrays.asList(compute);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentSnapshotResponseProjection projection = new SegmentSnapshotResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateSegmentSnapshotMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateSegmentSnapshotMutationResponse.class);
        return result.createSegmentSnapshot();
    }

}