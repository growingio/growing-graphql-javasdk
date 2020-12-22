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
final public class $MeasurementsQueryResolver implements MeasurementsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $MeasurementsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $MeasurementsQueryResolver() {}

    @Override
    public java.util.List<MeasurableDto> measurements(String projectId, java.util.List<String> t, String q, String c) throws Exception {
        MeasurementsQueryRequest request = new MeasurementsQueryRequest();
        List<String> keys = Arrays.asList("projectId", "t", "q", "c");
        List<?> values = Arrays.asList(projectId, t, q, c);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        MeasurableResponseProjection projection = new MeasurableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        MeasurementsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, MeasurementsQueryResponse.class);
        return result.measurements();
    }

}