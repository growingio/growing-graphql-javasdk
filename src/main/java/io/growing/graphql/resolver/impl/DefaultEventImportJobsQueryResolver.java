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
final public class DefaultEventImportJobsQueryResolver implements EventImportJobsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultEventImportJobsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultEventImportJobsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<EventImportJobDto> eventImportJobs() throws Exception {
        EventImportJobsQueryRequest request = new EventImportJobsQueryRequest();
        EventImportJobResponseProjection projection = new EventImportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        EventImportJobsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, EventImportJobsQueryResponse.class);
        return result.eventImportJobs();
    }

}