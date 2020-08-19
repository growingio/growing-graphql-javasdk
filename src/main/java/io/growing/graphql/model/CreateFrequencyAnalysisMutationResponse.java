package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class CreateFrequencyAnalysisMutationResponse extends GraphQLResult<Map<String, FrequencyAnalysisDto>> {

    private static final String OPERATION_NAME = "createFrequencyAnalysis";

    public CreateFrequencyAnalysisMutationResponse() {
    }

    public FrequencyAnalysisDto createFrequencyAnalysis() {
        Map<String, FrequencyAnalysisDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
