package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class KpiAnalysisQueryResponse extends GraphQLResult<Map<String, KpiAnalysisDto>> {

    private static final String OPERATION_NAME = "kpiAnalysis";

    public KpiAnalysisQueryResponse() {
    }

    public KpiAnalysisDto kpiAnalysis() {
        Map<String, KpiAnalysisDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
