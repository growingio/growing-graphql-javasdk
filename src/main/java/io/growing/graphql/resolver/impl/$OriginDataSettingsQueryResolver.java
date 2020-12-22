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
final public class $OriginDataSettingsQueryResolver implements OriginDataSettingsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $OriginDataSettingsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $OriginDataSettingsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<OriginDataSettingDto> originDataSettings() throws Exception {
        OriginDataSettingsQueryRequest request = new OriginDataSettingsQueryRequest();
        OriginDataSettingResponseProjection projection = new OriginDataSettingResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        OriginDataSettingsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, OriginDataSettingsQueryResponse.class);
        return result.originDataSettings();
    }

}