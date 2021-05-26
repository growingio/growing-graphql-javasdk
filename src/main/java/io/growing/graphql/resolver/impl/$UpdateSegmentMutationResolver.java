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
final public class $UpdateSegmentMutationResolver implements UpdateSegmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateSegmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateSegmentMutationResolver() {}

    @Override
    public SegmentDto updateSegment(String projectId, String id, SegmentInputDto segment) throws Exception {
        UpdateSegmentMutationRequest request = new UpdateSegmentMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "segment");
        List<?> values = Arrays.asList(projectId, id, segment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentResponseProjection projection = new SegmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateSegmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateSegmentMutationResponse.class);
        return result.updateSegment();
    }

}