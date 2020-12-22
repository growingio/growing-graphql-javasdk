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
    date = "2020-12-22T15:45:58+0800"
)
final public class $CreateSegmentMutationResolver implements CreateSegmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateSegmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateSegmentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SegmentDto createSegment(String projectId, SegmentInputDto segment) throws Exception {
        CreateSegmentMutationRequest request = new CreateSegmentMutationRequest();
        List<String> keys = Arrays.asList("projectId", "segment");
        List<?> values = Arrays.asList(projectId, segment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentResponseProjection projection = new SegmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateSegmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateSegmentMutationResponse.class);
        return result.createSegment();
    }

}