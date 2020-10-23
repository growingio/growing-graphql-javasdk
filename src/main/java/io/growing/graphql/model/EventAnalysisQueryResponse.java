package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class EventAnalysisQueryResponse extends GraphQLResult<Map<String, EventAnalysisDto>> {

    private static final String OPERATION_NAME = "eventAnalysis";

    public EventAnalysisQueryResponse() {
    }

    public EventAnalysisDto eventAnalysis() {
        Map<String, EventAnalysisDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
