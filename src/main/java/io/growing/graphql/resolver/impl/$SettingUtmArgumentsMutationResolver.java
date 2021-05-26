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
final public class $SettingUtmArgumentsMutationResolver implements SettingUtmArgumentsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SettingUtmArgumentsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SettingUtmArgumentsMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean settingUtmArguments(java.util.List<UtmArgumentInputDto> utmArguments) throws Exception {
        SettingUtmArgumentsMutationRequest request = new SettingUtmArgumentsMutationRequest();
        List<String> keys = Arrays.asList("utmArguments");
        List<?> values = Arrays.asList(utmArguments);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        SettingUtmArgumentsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SettingUtmArgumentsMutationResponse.class);
        return result.settingUtmArguments();
    }

}