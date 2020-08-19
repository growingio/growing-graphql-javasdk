package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class AnalysisDashboardReferersQueryResponse extends GraphQLResult<Map<String, java.util.List<DashboardReferenceDto>>> {

    private static final String OPERATION_NAME = "analysisDashboardReferers";

    public AnalysisDashboardReferersQueryResponse() {
    }

    public java.util.List<DashboardReferenceDto> analysisDashboardReferers() {
        Map<String, java.util.List<DashboardReferenceDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
