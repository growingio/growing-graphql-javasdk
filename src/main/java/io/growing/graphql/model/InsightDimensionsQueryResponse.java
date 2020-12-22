package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的 insightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class InsightDimensionsQueryResponse extends GraphQLResult<Map<String, java.util.List<DimensionDto>>> {

    private static final String OPERATION_NAME = "insightDimensions";

    public InsightDimensionsQueryResponse() {
    }

    /**
     * 数据中心的 insightDimensions
     */
    public java.util.List<DimensionDto> insightDimensions() {
        Map<String, java.util.List<DimensionDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
