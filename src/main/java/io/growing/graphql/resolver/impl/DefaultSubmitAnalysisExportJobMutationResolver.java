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
final public class DefaultSubmitAnalysisExportJobMutationResolver implements SubmitAnalysisExportJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSubmitAnalysisExportJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSubmitAnalysisExportJobMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public AnalysisExportJobDto submitAnalysisExportJob(String id, AnalysisExportJobParamDto param, String charset) throws Exception {
        SubmitAnalysisExportJobMutationRequest request = new SubmitAnalysisExportJobMutationRequest();
        List<String> keys = Arrays.asList("id", "param", "charset");
        List<?> values = Arrays.asList(id, param, charset);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AnalysisExportJobResponseProjection projection = new AnalysisExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitAnalysisExportJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitAnalysisExportJobMutationResponse.class);
        return result.submitAnalysisExportJob();
    }

}