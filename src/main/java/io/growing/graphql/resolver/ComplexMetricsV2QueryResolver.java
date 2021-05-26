package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 大洋分析计算指标查询列表页接口(由ID查询仍走旧接口)
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface ComplexMetricsV2QueryResolver {

    /**
     * 大洋分析计算指标查询列表页接口(由ID查询仍走旧接口)
     */
    java.util.List<ComplexMetricDto> complexMetricsV2(String projectId) throws Exception;

}