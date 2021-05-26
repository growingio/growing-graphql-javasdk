package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的 insightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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
