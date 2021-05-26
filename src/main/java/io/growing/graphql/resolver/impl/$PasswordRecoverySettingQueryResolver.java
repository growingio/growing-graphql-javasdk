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
final public class $PasswordRecoverySettingQueryResolver implements PasswordRecoverySettingQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $PasswordRecoverySettingQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $PasswordRecoverySettingQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public PasswordRecoverySettingDto passwordRecoverySetting() throws Exception {
        PasswordRecoverySettingQueryRequest request = new PasswordRecoverySettingQueryRequest();
        PasswordRecoverySettingResponseProjection projection = new PasswordRecoverySettingResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        PasswordRecoverySettingQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PasswordRecoverySettingQueryResponse.class);
        return result.passwordRecoverySetting();
    }

}