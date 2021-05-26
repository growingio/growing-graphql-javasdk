package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 更新计算指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateComplexMetricMutationResolver {

    /**
     * 更新计算指标
     */
    @javax.validation.constraints.NotNull
    ComplexMetricDto updateComplexMetric(String projectId, String id, ComplexMetricInputDto complexMetric) throws Exception;

}