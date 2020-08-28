package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class PreparedMetricsQueryResponse extends GraphQLResult<Map<String, java.util.List<PreparedMetricDto>>> {

    private static final String OPERATION_NAME = "preparedMetrics";

    public PreparedMetricsQueryResponse() {
    }

    public java.util.List<PreparedMetricDto> preparedMetrics() {
        Map<String, java.util.List<PreparedMetricDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
