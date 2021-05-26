package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 批量删除计算指标
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface BatchDeleteComplexMetricsMutationResolver {

    /**
     * 批量删除计算指标
     */
    Boolean batchDeleteComplexMetrics(String projectId, java.util.List<String> ids) throws Exception;

}