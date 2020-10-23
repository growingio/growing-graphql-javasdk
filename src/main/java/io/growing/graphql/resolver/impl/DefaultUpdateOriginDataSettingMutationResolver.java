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
final public class DefaultUpdateOriginDataSettingMutationResolver implements UpdateOriginDataSettingMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateOriginDataSettingMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateOriginDataSettingMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateOriginDataSetting(java.util.List<OriginDataSettingInputDto> originDatas) throws Exception {
        UpdateOriginDataSettingMutationRequest request = new UpdateOriginDataSettingMutationRequest();
        List<String> keys = Arrays.asList("originDatas");
        List<?> values = Arrays.asList(originDatas);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateOriginDataSettingMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateOriginDataSettingMutationResponse.class);
        return result.updateOriginDataSetting();
    }

}