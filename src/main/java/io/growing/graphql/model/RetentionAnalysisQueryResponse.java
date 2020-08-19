package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class RetentionAnalysisQueryResponse extends GraphQLResult<Map<String, RetentionAnalysisDto>> {

    private static final String OPERATION_NAME = "retentionAnalysis";

    public RetentionAnalysisQueryResponse() {
    }

    public RetentionAnalysisDto retentionAnalysis() {
        Map<String, RetentionAnalysisDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
