package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 预定义维度列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PreparedDimensionsQueryResponse extends GraphQLResult<Map<String, java.util.List<PreparedDimensionDto>>> {

    private static final String OPERATION_NAME = "preparedDimensions";

    public PreparedDimensionsQueryResponse() {
    }

    /**
     * 预定义维度列表
     */
    public java.util.List<PreparedDimensionDto> preparedDimensions() {
        Map<String, java.util.List<PreparedDimensionDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
