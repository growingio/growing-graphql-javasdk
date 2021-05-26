package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 创建新事件分析图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateOlapEventAnalysisMutationResolver {

    /**
     * 创建新事件分析图
     */
    @javax.validation.constraints.NotNull
    EventAnalysisDto createOlapEventAnalysis(String projectId, OlapEventAnalysisInputDto olapEventAnalysis) throws Exception;

}