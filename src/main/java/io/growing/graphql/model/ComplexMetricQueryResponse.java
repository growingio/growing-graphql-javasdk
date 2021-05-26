package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 单个计算指标详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ComplexMetricQueryResponse extends GraphQLResult<Map<String, ComplexMetricDto>> {

    private static final String OPERATION_NAME = "complexMetric";

    public ComplexMetricQueryResponse() {
    }

    /**
     * 单个计算指标详情
     */
    public ComplexMetricDto complexMetric() {
        Map<String, ComplexMetricDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
