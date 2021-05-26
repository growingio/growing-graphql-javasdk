package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 单个计算指标详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface ComplexMetricQueryResolver {

    /**
     * 单个计算指标详情
     */
    ComplexMetricDto complexMetric(String projectId, String id) throws Exception;

}