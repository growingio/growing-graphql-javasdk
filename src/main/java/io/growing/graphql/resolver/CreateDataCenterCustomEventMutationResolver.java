package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 创建打点事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateDataCenterCustomEventMutationResolver {

    /**
     * 数据中心 创建打点事件
     */
    @javax.validation.constraints.NotNull
    CustomEventDto createDataCenterCustomEvent(CustomEventInputDto customEvent) throws Exception;

}