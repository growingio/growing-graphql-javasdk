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
final public class DefaultCreateEventImportJobMutationResolver implements CreateEventImportJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateEventImportJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateEventImportJobMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public EventImportJobDto createEventImportJob(String tunnelId, String timeRange) throws Exception {
        CreateEventImportJobMutationRequest request = new CreateEventImportJobMutationRequest();
        List<String> keys = Arrays.asList("tunnelId", "timeRange");
        List<?> values = Arrays.asList(tunnelId, timeRange);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventImportJobResponseProjection projection = new EventImportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateEventImportJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateEventImportJobMutationResponse.class);
        return result.createEventImportJob();
    }

}