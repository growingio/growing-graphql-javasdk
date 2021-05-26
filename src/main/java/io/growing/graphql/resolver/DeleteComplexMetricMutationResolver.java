package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 删除计算指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DeleteComplexMetricMutationResolver {

    /**
     * 删除计算指标
     */
    Boolean deleteComplexMetric(String projectId, String id) throws Exception;

}