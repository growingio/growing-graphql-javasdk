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
final public class DefaultSegmentDocumentQueryResolver implements SegmentDocumentQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSegmentDocumentQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSegmentDocumentQueryResolver() {}

    @Override
    public SegmentDocumentDto segmentDocument(String id) throws Exception {
        SegmentDocumentQueryRequest request = new SegmentDocumentQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SegmentDocumentResponseProjection projection = new SegmentDocumentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SegmentDocumentQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SegmentDocumentQueryResponse.class);
        return result.segmentDocument();
    }

}