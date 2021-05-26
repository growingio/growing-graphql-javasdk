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
 * 请求日志导出
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $SubmitLogExportJobMutationResolver implements SubmitLogExportJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SubmitLogExportJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SubmitLogExportJobMutationResolver() {}

    /**
     * 请求日志导出
     */
    @javax.validation.constraints.NotNull
    @Override
    public AuditLogExportJobDto submitLogExportJob(AuditLogQueryInputDto q, String timeRange) throws Exception {
        SubmitLogExportJobMutationRequest request = new SubmitLogExportJobMutationRequest();
        List<String> keys = Arrays.asList("q", "timeRange");
        List<?> values = Arrays.asList(q, timeRange);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AuditLogExportJobResponseProjection projection = new AuditLogExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitLogExportJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitLogExportJobMutationResponse.class);
        return result.submitLogExportJob();
    }

}