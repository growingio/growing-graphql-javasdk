package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public interface InsightDimensionsQueryResolver {

    java.util.List<DimensionDto> insightDimensions(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception;

}