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
final public class $SubmitAnalysisExportJobMutationResolver implements SubmitAnalysisExportJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SubmitAnalysisExportJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SubmitAnalysisExportJobMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public AnalysisExportJobDto submitAnalysisExportJob(String projectId, String id, AnalysisExportJobParamDto param, String charset) throws Exception {
        SubmitAnalysisExportJobMutationRequest request = new SubmitAnalysisExportJobMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "param", "charset");
        List<?> values = Arrays.asList(projectId, id, param, charset);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AnalysisExportJobResponseProjection projection = new AnalysisExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitAnalysisExportJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitAnalysisExportJobMutationResponse.class);
        return result.submitAnalysisExportJob();
    }

}