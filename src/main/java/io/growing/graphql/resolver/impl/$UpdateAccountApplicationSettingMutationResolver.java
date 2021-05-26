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
final public class $UpdateAccountApplicationSettingMutationResolver implements UpdateAccountApplicationSettingMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateAccountApplicationSettingMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateAccountApplicationSettingMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateAccountApplicationSetting(AccountApplicationSettingInputDto input) throws Exception {
        UpdateAccountApplicationSettingMutationRequest request = new UpdateAccountApplicationSettingMutationRequest();
        List<String> keys = Arrays.asList("input");
        List<?> values = Arrays.asList(input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateAccountApplicationSettingMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateAccountApplicationSettingMutationResponse.class);
        return result.updateAccountApplicationSetting();
    }

}