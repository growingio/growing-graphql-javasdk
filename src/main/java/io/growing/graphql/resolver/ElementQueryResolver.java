package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 无埋点 单个元素详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface ElementQueryResolver {

    /**
     * 无埋点 单个元素详情
     */
    ElementDto element(String projectId, String id) throws Exception;

}