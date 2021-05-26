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
final public class $SubmitSegmentUserExportJobV2MutationResolver implements SubmitSegmentUserExportJobV2MutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SubmitSegmentUserExportJobV2MutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SubmitSegmentUserExportJobV2MutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SegmentUserExportJobDto submitSegmentUserExportJobV2(String projectId, ExportSegmentParameterInputDto parameter) throws Exception {
        SubmitSegmentUserExportJobV2MutationRequest request = new SubmitSegmentUserExportJobV2MutationRequest();
        List<String> keys = Arrays.asList("projectId", "parameter");
        List<?> values = Arrays.asList(projectId, parameter);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentUserExportJobResponseProjection projection = new SegmentUserExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitSegmentUserExportJobV2MutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitSegmentUserExportJobV2MutationResponse.class);
        return result.submitSegmentUserExportJobV2();
    }

}