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

/**
 * 更新水印配置
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateWaterMarkSettingMutationResolver implements UpdateWaterMarkSettingMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateWaterMarkSettingMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateWaterMarkSettingMutationResolver() {}

    /**
     * 更新水印配置
     */
    @javax.validation.constraints.NotNull
    @Override
    public Boolean updateWaterMarkSetting(UpdateWaterMarkSettingInputDto input) throws Exception {
        UpdateWaterMarkSettingMutationRequest request = new UpdateWaterMarkSettingMutationRequest();
        List<String> keys = Arrays.asList("input");
        List<?> values = Arrays.asList(input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateWaterMarkSettingMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateWaterMarkSettingMutationResponse.class);
        return result.updateWaterMarkSetting();
    }

}