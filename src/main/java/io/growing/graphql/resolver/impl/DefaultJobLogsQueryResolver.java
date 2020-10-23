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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultJobLogsQueryResolver implements JobLogsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultJobLogsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultJobLogsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<LogEntryDto> jobLogs(String id) throws Exception {
        JobLogsQueryRequest request = new JobLogsQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        LogEntryResponseProjection projection = new LogEntryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        JobLogsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, JobLogsQueryResponse.class);
        return result.jobLogs();
    }

}