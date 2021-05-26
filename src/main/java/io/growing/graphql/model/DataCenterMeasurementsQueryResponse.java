package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 数据中心的指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterMeasurementsQueryResponse extends GraphQLResult<Map<String, java.util.List<MeasurableDto>>> {

    private static final String OPERATION_NAME = "dataCenterMeasurements";

    public DataCenterMeasurementsQueryResponse() {
    }

    /**
     * 数据中心的指标列表
     */
    public java.util.List<MeasurableDto> dataCenterMeasurements() {
        Map<String, java.util.List<MeasurableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
