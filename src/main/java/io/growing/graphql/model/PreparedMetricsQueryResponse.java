package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 预定义指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PreparedMetricsQueryResponse extends GraphQLResult<Map<String, java.util.List<PreparedMetricDto>>> {

    private static final String OPERATION_NAME = "preparedMetrics";

    public PreparedMetricsQueryResponse() {
    }

    /**
     * 预定义指标列表
     */
    public java.util.List<PreparedMetricDto> preparedMetrics() {
        Map<String, java.util.List<PreparedMetricDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
