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
final public class $TogglePasswordRecoverySettingMutationResolver implements TogglePasswordRecoverySettingMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $TogglePasswordRecoverySettingMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TogglePasswordRecoverySettingMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public PasswordRecoverySettingDto togglePasswordRecoverySetting() throws Exception {
        TogglePasswordRecoverySettingMutationRequest request = new TogglePasswordRecoverySettingMutationRequest();
        PasswordRecoverySettingResponseProjection projection = new PasswordRecoverySettingResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        TogglePasswordRecoverySettingMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TogglePasswordRecoverySettingMutationResponse.class);
        return result.togglePasswordRecoverySetting();
    }

}