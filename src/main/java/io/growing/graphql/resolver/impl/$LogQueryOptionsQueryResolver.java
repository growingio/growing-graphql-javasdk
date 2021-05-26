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
 * 日志搜索项
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $LogQueryOptionsQueryResolver implements LogQueryOptionsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $LogQueryOptionsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $LogQueryOptionsQueryResolver() {}

    /**
     * 日志搜索项
     */
    @javax.validation.constraints.NotNull
    @Override
    public AuditLogQueryOptionDto logQueryOptions() throws Exception {
        LogQueryOptionsQueryRequest request = new LogQueryOptionsQueryRequest();
        AuditLogQueryOptionResponseProjection projection = new AuditLogQueryOptionResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        LogQueryOptionsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, LogQueryOptionsQueryResponse.class);
        return result.logQueryOptions();
    }

}