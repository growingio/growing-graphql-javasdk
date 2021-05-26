package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 获取所有表字段信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface TableDataDescriptionQueryResolver {

    /**
     * 获取所有表字段信息
     */
    @javax.validation.constraints.NotNull
    java.util.List<TableInfoDto> tableDataDescription() throws Exception;

}