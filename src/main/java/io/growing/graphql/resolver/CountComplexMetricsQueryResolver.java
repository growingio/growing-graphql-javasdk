package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 统计计算指标的个数
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CountComplexMetricsQueryResolver {

    /**
     * 统计计算指标的个数
     */
    Integer countComplexMetrics(String projectId) throws Exception;

}