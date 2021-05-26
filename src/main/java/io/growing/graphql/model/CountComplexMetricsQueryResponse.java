package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 统计计算指标的个数
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CountComplexMetricsQueryResponse extends GraphQLResult<Map<String, Integer>> {

    private static final String OPERATION_NAME = "countComplexMetrics";

    public CountComplexMetricsQueryResponse() {
    }

    /**
     * 统计计算指标的个数
     */
    public Integer countComplexMetrics() {
        Map<String, Integer> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
