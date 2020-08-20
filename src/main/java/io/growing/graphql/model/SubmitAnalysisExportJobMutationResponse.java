package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class SubmitAnalysisExportJobMutationResponse extends GraphQLResult<Map<String, AnalysisExportJobDto>> {

    private static final String OPERATION_NAME = "submitAnalysisExportJob";

    public SubmitAnalysisExportJobMutationResponse() {
    }

    public AnalysisExportJobDto submitAnalysisExportJob() {
        Map<String, AnalysisExportJobDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
