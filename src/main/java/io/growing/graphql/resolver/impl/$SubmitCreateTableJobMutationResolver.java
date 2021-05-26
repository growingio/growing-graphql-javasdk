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
final public class $SubmitCreateTableJobMutationResolver implements SubmitCreateTableJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SubmitCreateTableJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SubmitCreateTableJobMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public CreateTableJobDto submitCreateTableJob(String projectId, CreateTableJobParameterInputDto parameter) throws Exception {
        SubmitCreateTableJobMutationRequest request = new SubmitCreateTableJobMutationRequest();
        List<String> keys = Arrays.asList("projectId", "parameter");
        List<?> values = Arrays.asList(projectId, parameter);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        CreateTableJobResponseProjection projection = new CreateTableJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitCreateTableJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitCreateTableJobMutationResponse.class);
        return result.submitCreateTableJob();
    }

}