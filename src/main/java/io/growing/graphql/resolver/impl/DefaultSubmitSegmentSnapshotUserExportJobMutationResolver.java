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
final public class DefaultSubmitSegmentSnapshotUserExportJobMutationResolver implements SubmitSegmentSnapshotUserExportJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSubmitSegmentSnapshotUserExportJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSubmitSegmentSnapshotUserExportJobMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SegmentUserExportJobDto submitSegmentSnapshotUserExportJob(String id, java.util.List<String> properties, String charset) throws Exception {
        SubmitSegmentSnapshotUserExportJobMutationRequest request = new SubmitSegmentSnapshotUserExportJobMutationRequest();
        List<String> keys = Arrays.asList("id", "properties", "charset");
        List<?> values = Arrays.asList(id, properties, charset);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentUserExportJobResponseProjection projection = new SegmentUserExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitSegmentSnapshotUserExportJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitSegmentSnapshotUserExportJobMutationResponse.class);
        return result.submitSegmentSnapshotUserExportJob();
    }

}