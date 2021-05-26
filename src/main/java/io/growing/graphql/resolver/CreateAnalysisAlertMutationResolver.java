package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 创建分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateAnalysisAlertMutationResolver {

    /**
     * 创建分析预警
     */
    @javax.validation.constraints.NotNull
    AnalysisAlertsDto createAnalysisAlert(String projectId, AnalysisAlertsInputDto analysisAlert) throws Exception;

}