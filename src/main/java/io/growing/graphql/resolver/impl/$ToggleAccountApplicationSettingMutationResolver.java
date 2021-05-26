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
final public class $ToggleAccountApplicationSettingMutationResolver implements ToggleAccountApplicationSettingMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $ToggleAccountApplicationSettingMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ToggleAccountApplicationSettingMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public AccountApplicationSettingDto toggleAccountApplicationSetting() throws Exception {
        ToggleAccountApplicationSettingMutationRequest request = new ToggleAccountApplicationSettingMutationRequest();
        AccountApplicationSettingResponseProjection projection = new AccountApplicationSettingResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ToggleAccountApplicationSettingMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ToggleAccountApplicationSettingMutationResponse.class);
        return result.toggleAccountApplicationSetting();
    }

}