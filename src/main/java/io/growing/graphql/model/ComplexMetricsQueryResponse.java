package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class ComplexMetricsQueryResponse extends GraphQLResult<Map<String, java.util.List<ComplexMetricDto>>> {

    private static final String OPERATION_NAME = "complexMetrics";

    public ComplexMetricsQueryResponse() {
    }

    public java.util.List<ComplexMetricDto> complexMetrics() {
        Map<String, java.util.List<ComplexMetricDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
