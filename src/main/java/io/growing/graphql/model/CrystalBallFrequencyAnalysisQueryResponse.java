package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class CrystalBallFrequencyAnalysisQueryResponse extends GraphQLResult<Map<String, FrequencyAnalysisDto>> {

    private static final String OPERATION_NAME = "crystalBallFrequencyAnalysis";

    public CrystalBallFrequencyAnalysisQueryResponse() {
    }

    public FrequencyAnalysisDto crystalBallFrequencyAnalysis() {
        Map<String, FrequencyAnalysisDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
