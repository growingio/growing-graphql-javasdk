package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public interface SubmitAnalysisExportJobMutationResolver {

    @javax.validation.constraints.NotNull
    AnalysisExportJobDto submitAnalysisExportJob(String id, AnalysisExportJobParamDto param, String charset) throws Exception;

}