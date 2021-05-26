package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 计算指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface ComplexMetricsQueryResolver {

    /**
     * 计算指标列表
     */
    java.util.List<ComplexMetricDto> complexMetrics(String projectId) throws Exception;

}