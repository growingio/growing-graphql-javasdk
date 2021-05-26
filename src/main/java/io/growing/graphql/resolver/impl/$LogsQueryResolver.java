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
 * 查询日志
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $LogsQueryResolver implements LogsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $LogsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $LogsQueryResolver() {}

    /**
     * 查询日志
     */
    @javax.validation.constraints.NotNull
    @Override
    public SlicePaginationDto logs(AuditLogQueryInputDto q, String timeRange, Integer offset, Integer limit) throws Exception {
        LogsQueryRequest request = new LogsQueryRequest();
        List<String> keys = Arrays.asList("q", "timeRange", "offset", "limit");
        List<?> values = Arrays.asList(q, timeRange, offset, limit);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SlicePaginationResponseProjection projection = new SlicePaginationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        LogsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, LogsQueryResponse.class);
        return result.logs();
    }

}