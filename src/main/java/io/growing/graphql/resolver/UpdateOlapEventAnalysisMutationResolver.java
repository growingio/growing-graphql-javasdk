package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 更新新事件分析图
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateOlapEventAnalysisMutationResolver {

    /**
     * 更新新事件分析图
     */
    @javax.validation.constraints.NotNull
    EventAnalysisDto updateOlapEventAnalysis(String projectId, String id, OlapEventAnalysisInputDto olapEventAnalysis) throws Exception;

}