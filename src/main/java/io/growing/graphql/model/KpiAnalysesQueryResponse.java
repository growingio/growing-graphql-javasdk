package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class KpiAnalysesQueryResponse extends GraphQLResult<Map<String, java.util.List<KpiAnalysisDto>>> {

    private static final String OPERATION_NAME = "kpiAnalyses";

    public KpiAnalysesQueryResponse() {
    }

    public java.util.List<KpiAnalysisDto> kpiAnalyses() {
        Map<String, java.util.List<KpiAnalysisDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
