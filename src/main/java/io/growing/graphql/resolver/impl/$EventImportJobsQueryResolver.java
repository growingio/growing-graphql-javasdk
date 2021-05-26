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
    date = "2021-05-26T15:01:24+0800"
)
final public class $EventImportJobsQueryResolver implements EventImportJobsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $EventImportJobsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $EventImportJobsQueryResolver() {}

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