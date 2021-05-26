package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 批量删除打点事件
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface BatchDeleteDataCenterCustomEventsMutationResolver {

    /**
     * 数据中心 批量删除打点事件
     */
    Boolean batchDeleteDataCenterCustomEvents(java.util.List<String> ids) throws Exception;

}