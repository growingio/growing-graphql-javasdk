package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 请求日志导出
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class SubmitLogExportJobMutationResponse extends GraphQLResult<Map<String, AuditLogExportJobDto>> {

    private static final String OPERATION_NAME = "submitLogExportJob";

    public SubmitLogExportJobMutationResponse() {
    }

    /**
     * 请求日志导出
     */
    public AuditLogExportJobDto submitLogExportJob() {
        Map<String, AuditLogExportJobDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
