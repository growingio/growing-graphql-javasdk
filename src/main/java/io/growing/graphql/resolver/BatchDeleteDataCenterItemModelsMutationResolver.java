package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 批量删除物品模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface BatchDeleteDataCenterItemModelsMutationResolver {

    /**
     * 数据中心 批量删除物品模型
     */
    Boolean batchDeleteDataCenterItemModels(java.util.List<String> ids) throws Exception;

}