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
final public class DefaultSubmitSegmentUserExportJobMutationResolver implements SubmitSegmentUserExportJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSubmitSegmentUserExportJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSubmitSegmentUserExportJobMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SegmentUserExportJobDto submitSegmentUserExportJob(String segmentId, java.util.List<String> tags, java.util.List<String> properties, String charset) throws Exception {
        SubmitSegmentUserExportJobMutationRequest request = new SubmitSegmentUserExportJobMutationRequest();
        List<String> keys = Arrays.asList("segmentId", "tags", "properties", "charset");
        List<?> values = Arrays.asList(segmentId, tags, properties, charset);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentUserExportJobResponseProjection projection = new SegmentUserExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitSegmentUserExportJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitSegmentUserExportJobMutationResponse.class);
        return result.submitSegmentUserExportJob();
    }

}