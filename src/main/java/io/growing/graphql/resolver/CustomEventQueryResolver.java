package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 单个打点事件详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CustomEventQueryResolver {

    /**
     * 单个打点事件详情
     */
    CustomEventDto customEvent(String projectId, String id) throws Exception;

}