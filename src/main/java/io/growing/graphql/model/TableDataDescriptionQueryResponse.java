package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 获取所有表字段信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TableDataDescriptionQueryResponse extends GraphQLResult<Map<String, java.util.List<TableInfoDto>>> {

    private static final String OPERATION_NAME = "tableDataDescription";

    public TableDataDescriptionQueryResponse() {
    }

    /**
     * 获取所有表字段信息
     */
    public java.util.List<TableInfoDto> tableDataDescription() {
        Map<String, java.util.List<TableInfoDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
