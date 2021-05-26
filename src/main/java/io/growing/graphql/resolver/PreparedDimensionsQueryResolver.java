package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 预定义维度列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface PreparedDimensionsQueryResolver {

    /**
     * 预定义维度列表
     */
    java.util.List<PreparedDimensionDto> preparedDimensions(String projectId) throws Exception;

}