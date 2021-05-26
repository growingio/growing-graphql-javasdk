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
 * 查询日志导出状态
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $LogExportJobResultQueryResolver implements LogExportJobResultQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $LogExportJobResultQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $LogExportJobResultQueryResolver() {}

    /**
     * 查询日志导出状态
     */
    @javax.validation.constraints.NotNull
    @Override
    public AuditLogExportJobResultDto logExportJobResult(String id) throws Exception {
        LogExportJobResultQueryRequest request = new LogExportJobResultQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AuditLogExportJobResultResponseProjection projection = new AuditLogExportJobResultResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        LogExportJobResultQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, LogExportJobResultQueryResponse.class);
        return result.logExportJobResult();
    }

}