package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 聚合的指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MeasurementsQueryResponse extends GraphQLResult<Map<String, java.util.List<MeasurableDto>>> {

    private static final String OPERATION_NAME = "measurements";

    public MeasurementsQueryResponse() {
    }

    /**
     * 聚合的指标列表
     */
    public java.util.List<MeasurableDto> measurements() {
        Map<String, java.util.List<MeasurableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
