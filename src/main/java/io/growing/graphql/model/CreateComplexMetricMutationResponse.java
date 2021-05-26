package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 创建计算指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateComplexMetricMutationResponse extends GraphQLResult<Map<String, ComplexMetricDto>> {

    private static final String OPERATION_NAME = "createComplexMetric";

    public CreateComplexMetricMutationResponse() {
    }

    /**
     * 创建计算指标
     */
    public ComplexMetricDto createComplexMetric() {
        Map<String, ComplexMetricDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
