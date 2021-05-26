package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 查询日志导出状态
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface LogExportJobResultQueryResolver {

    /**
     * 查询日志导出状态
     */
    @javax.validation.constraints.NotNull
    AuditLogExportJobResultDto logExportJobResult(String id) throws Exception;

}