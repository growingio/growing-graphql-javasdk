package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 单个打点事件详情
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterCustomEventQueryResolver {

    /**
     * 数据中心 单个打点事件详情
     */
    CustomEventDto dataCenterCustomEvent(String id) throws Exception;

}