package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的预定定维度
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterPreparedDimensionsQueryResponse extends GraphQLResult<Map<String, java.util.List<PreparedDimensionDto>>> {

    private static final String OPERATION_NAME = "dataCenterPreparedDimensions";

    public DataCenterPreparedDimensionsQueryResponse() {
    }

    /**
     * 数据中心的预定定维度
     */
    public java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions() {
        Map<String, java.util.List<PreparedDimensionDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
