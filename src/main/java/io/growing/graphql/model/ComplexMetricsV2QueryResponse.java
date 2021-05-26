package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 大洋分析计算指标查询列表页接口(由ID查询仍走旧接口)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ComplexMetricsV2QueryResponse extends GraphQLResult<Map<String, java.util.List<ComplexMetricDto>>> {

    private static final String OPERATION_NAME = "complexMetricsV2";

    public ComplexMetricsV2QueryResponse() {
    }

    /**
     * 大洋分析计算指标查询列表页接口(由ID查询仍走旧接口)
     */
    public java.util.List<ComplexMetricDto> complexMetricsV2() {
        Map<String, java.util.List<ComplexMetricDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
