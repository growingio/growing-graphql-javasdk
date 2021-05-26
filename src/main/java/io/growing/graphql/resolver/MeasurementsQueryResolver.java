package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 聚合的指标列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface MeasurementsQueryResolver {

    /**
     * 聚合的指标列表
     */
    java.util.List<MeasurableDto> measurements(String projectId, java.util.List<String> t, String q, String c, String f) throws Exception;

}