package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class InsightDimensionsQueryResponse extends GraphQLResult<Map<String, java.util.List<DimensionDto>>> {

    private static final String OPERATION_NAME = "insightDimensions";

    public InsightDimensionsQueryResponse() {
    }

    public java.util.List<DimensionDto> insightDimensions() {
        Map<String, java.util.List<DimensionDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
