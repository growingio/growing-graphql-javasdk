package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 打点事件列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterCustomEventsQueryResolver {

    /**
     * 数据中心 打点事件列表
     */
    java.util.List<CustomEventDto> dataCenterCustomEvents() throws Exception;

}