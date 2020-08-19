package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class UpdateEventAnalysisMutationResponse extends GraphQLResult<Map<String, EventAnalysisDto>> {

    private static final String OPERATION_NAME = "updateEventAnalysis";

    public UpdateEventAnalysisMutationResponse() {
    }

    public EventAnalysisDto updateEventAnalysis() {
        Map<String, EventAnalysisDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
