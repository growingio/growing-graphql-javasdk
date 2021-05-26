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
 * 获取水印配置
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
final public class $WaterMarkSettingQueryResolver implements WaterMarkSettingQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $WaterMarkSettingQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $WaterMarkSettingQueryResolver() {}

    /**
     * 获取水印配置
     */
    @Override
    public WaterMarkSettingDto waterMarkSetting() throws Exception {
        WaterMarkSettingQueryRequest request = new WaterMarkSettingQueryRequest();
        WaterMarkSettingResponseProjection projection = new WaterMarkSettingResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        WaterMarkSettingQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, WaterMarkSettingQueryResponse.class);
        return result.waterMarkSetting();
    }

}