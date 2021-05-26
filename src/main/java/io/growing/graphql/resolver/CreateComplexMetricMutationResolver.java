package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 创建计算指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateComplexMetricMutationResolver {

    /**
     * 创建计算指标
     */
    @javax.validation.constraints.NotNull
    ComplexMetricDto createComplexMetric(String projectId, ComplexMetricInputDto complexMetric) throws Exception;

}