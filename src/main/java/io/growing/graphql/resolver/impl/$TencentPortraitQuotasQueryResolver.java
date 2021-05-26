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
 * 查询资源情况
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $TencentPortraitQuotasQueryResolver implements TencentPortraitQuotasQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $TencentPortraitQuotasQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TencentPortraitQuotasQueryResolver() {}

    /**
     * 查询资源情况
     */
    @javax.validation.constraints.NotNull
    @Override
    public TencentPortraitQuotasInfoDto tencentPortraitQuotas() throws Exception {
        TencentPortraitQuotasQueryRequest request = new TencentPortraitQuotasQueryRequest();
        TencentPortraitQuotasInfoResponseProjection projection = new TencentPortraitQuotasInfoResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        TencentPortraitQuotasQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TencentPortraitQuotasQueryResponse.class);
        return result.tencentPortraitQuotas();
    }

}