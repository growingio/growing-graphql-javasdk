package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 删除新事件分析图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DeleteOlapEventAnalysisMutationResolver {

    /**
     * 删除新事件分析图
     */
    @javax.validation.constraints.NotNull
    Boolean deleteOlapEventAnalysis(String projectId, String id) throws Exception;

}