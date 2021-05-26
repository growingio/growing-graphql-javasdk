package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 日志搜索项
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class LogQueryOptionsQueryResponse extends GraphQLResult<Map<String, AuditLogQueryOptionDto>> {

    private static final String OPERATION_NAME = "logQueryOptions";

    public LogQueryOptionsQueryResponse() {
    }

    /**
     * 日志搜索项
     */
    public AuditLogQueryOptionDto logQueryOptions() {
        Map<String, AuditLogQueryOptionDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
