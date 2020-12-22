package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class FunnelAnalysesQueryResponse extends GraphQLResult<Map<String, java.util.List<FunnelAnalysisDto>>> {

    private static final String OPERATION_NAME = "funnelAnalyses";

    public FunnelAnalysesQueryResponse() {
    }

    public java.util.List<FunnelAnalysisDto> funnelAnalyses() {
        Map<String, java.util.List<FunnelAnalysisDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
