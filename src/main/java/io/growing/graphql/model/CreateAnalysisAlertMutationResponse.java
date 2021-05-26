package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 创建分析预警
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateAnalysisAlertMutationResponse extends GraphQLResult<Map<String, AnalysisAlertsDto>> {

    private static final String OPERATION_NAME = "createAnalysisAlert";

    public CreateAnalysisAlertMutationResponse() {
    }

    /**
     * 创建分析预警
     */
    public AnalysisAlertsDto createAnalysisAlert() {
        Map<String, AnalysisAlertsDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
