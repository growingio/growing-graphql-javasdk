package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 查询日志导出状态
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class LogExportJobResultQueryResponse extends GraphQLResult<Map<String, AuditLogExportJobResultDto>> {

    private static final String OPERATION_NAME = "logExportJobResult";

    public LogExportJobResultQueryResponse() {
    }

    /**
     * 查询日志导出状态
     */
    public AuditLogExportJobResultDto logExportJobResult() {
        Map<String, AuditLogExportJobResultDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
