package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心的指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface DataCenterMeasurementsQueryResolver {

    /**
     * 数据中心的指标列表
     */
    java.util.List<MeasurableDto> dataCenterMeasurements() throws Exception;

}