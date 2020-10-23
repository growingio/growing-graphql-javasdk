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
final public class DefaultUpdateSegmentMutationResolver implements UpdateSegmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateSegmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateSegmentMutationResolver() {}

    @Override
    public SegmentDto updateSegment(String id, SegmentInputDto segment) throws Exception {
        UpdateSegmentMutationRequest request = new UpdateSegmentMutationRequest();
        List<String> keys = Arrays.asList("id", "segment");
        List<?> values = Arrays.asList(id, segment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentResponseProjection projection = new SegmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateSegmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateSegmentMutationResponse.class);
        return result.updateSegment();
    }

}