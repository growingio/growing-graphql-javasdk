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
final public class $SettingSegmentMeasurementsMutationResolver implements SettingSegmentMeasurementsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SettingSegmentMeasurementsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SettingSegmentMeasurementsMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean settingSegmentMeasurements(String projectId, SettingSegmentMeasurementPolicyDto policy, java.util.List<MeasurementInputDto> measurements, String id) throws Exception {
        SettingSegmentMeasurementsMutationRequest request = new SettingSegmentMeasurementsMutationRequest();
        List<String> keys = Arrays.asList("projectId", "policy", "measurements", "id");
        List<?> values = Arrays.asList(projectId, policy, measurements, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        SettingSegmentMeasurementsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SettingSegmentMeasurementsMutationResponse.class);
        return result.settingSegmentMeasurements();
    }

}