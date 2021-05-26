package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心的指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterMeasurementsQueryResolver {

    /**
     * 数据中心的指标列表
     */
    java.util.List<MeasurableDto> dataCenterMeasurements() throws Exception;

}