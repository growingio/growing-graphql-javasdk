package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 查询日志
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface LogsQueryResolver {

    /**
     * 查询日志
     */
    @javax.validation.constraints.NotNull
    SlicePaginationDto logs(AuditLogQueryInputDto q, String timeRange, Integer offset, Integer limit) throws Exception;

}