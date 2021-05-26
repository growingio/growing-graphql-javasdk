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
final public class $SettingPersonaMeasurementsMutationResolver implements SettingPersonaMeasurementsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SettingPersonaMeasurementsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SettingPersonaMeasurementsMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean settingPersonaMeasurements(String projectId, java.util.List<MeasurementInputDto> measurements) throws Exception {
        SettingPersonaMeasurementsMutationRequest request = new SettingPersonaMeasurementsMutationRequest();
        List<String> keys = Arrays.asList("projectId", "measurements");
        List<?> values = Arrays.asList(projectId, measurements);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        SettingPersonaMeasurementsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SettingPersonaMeasurementsMutationResponse.class);
        return result.settingPersonaMeasurements();
    }

}