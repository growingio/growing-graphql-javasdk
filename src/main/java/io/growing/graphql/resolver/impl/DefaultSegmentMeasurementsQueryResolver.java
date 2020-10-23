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
final public class DefaultSegmentMeasurementsQueryResolver implements SegmentMeasurementsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSegmentMeasurementsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSegmentMeasurementsQueryResolver() {}

    @Override
    public java.util.List<MeasurementDto> segmentMeasurements(SettingSegmentMeasurementPolicyDto policy, String id) throws Exception {
        SegmentMeasurementsQueryRequest request = new SegmentMeasurementsQueryRequest();
        List<String> keys = Arrays.asList("policy", "id");
        List<?> values = Arrays.asList(policy, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        MeasurementResponseProjection projection = new MeasurementResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SegmentMeasurementsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SegmentMeasurementsQueryResponse.class);
        return result.segmentMeasurements();
    }

}