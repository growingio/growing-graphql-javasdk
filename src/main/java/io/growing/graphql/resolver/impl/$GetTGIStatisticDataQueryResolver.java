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
 * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $GetTGIStatisticDataQueryResolver implements GetTGIStatisticDataQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $GetTGIStatisticDataQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $GetTGIStatisticDataQueryResolver() {}

    /**
     * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
     */
    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<TGIStatisticDataDto> getTGIStatisticData(String projectId, String segmentId) throws Exception {
        GetTGIStatisticDataQueryRequest request = new GetTGIStatisticDataQueryRequest();
        List<String> keys = Arrays.asList("projectId", "segmentId");
        List<?> values = Arrays.asList(projectId, segmentId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TGIStatisticDataResponseProjection projection = new TGIStatisticDataResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        GetTGIStatisticDataQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, GetTGIStatisticDataQueryResponse.class);
        return result.getTGIStatisticData();
    }

}