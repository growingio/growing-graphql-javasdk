package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class FrequencyAnalysesQueryResponse extends GraphQLResult<Map<String, java.util.List<FrequencyAnalysisDto>>> {

    private static final String OPERATION_NAME = "frequencyAnalyses";

    public FrequencyAnalysesQueryResponse() {
    }

    public java.util.List<FrequencyAnalysisDto> frequencyAnalyses() {
        Map<String, java.util.List<FrequencyAnalysisDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
