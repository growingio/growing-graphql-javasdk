package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心的 InsightDimensions
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface DataCenterInsightDimensionsQueryResolver {

    /**
     * 数据中心的 InsightDimensions
     */
    java.util.List<DimensionDto> dataCenterInsightDimensions(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception;

}