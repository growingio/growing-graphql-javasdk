package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的 InsightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterInsightDimensionsQueryResponse extends GraphQLResult<Map<String, java.util.List<DimensionDto>>> {

    private static final String OPERATION_NAME = "dataCenterInsightDimensions";

    public DataCenterInsightDimensionsQueryResponse() {
    }

    /**
     * 数据中心的 InsightDimensions
     */
    public java.util.List<DimensionDto> dataCenterInsightDimensions() {
        Map<String, java.util.List<DimensionDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
