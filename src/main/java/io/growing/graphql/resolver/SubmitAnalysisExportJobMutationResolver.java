package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface SubmitAnalysisExportJobMutationResolver {

    @javax.validation.constraints.NotNull
    AnalysisExportJobDto submitAnalysisExportJob(String projectId, String id, AnalysisExportJobParamDto param, String charset) throws Exception;

}