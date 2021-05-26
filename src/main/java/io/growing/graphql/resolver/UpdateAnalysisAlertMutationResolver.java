package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 更新分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateAnalysisAlertMutationResolver {

    /**
     * 更新分析预警
     */
    @javax.validation.constraints.NotNull
    AnalysisAlertsDto updateAnalysisAlert(String projectId, String id, AnalysisAlertsInputDto analysisAlert) throws Exception;

}