package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 批量删除物品变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface BatchDeleteDataCenterItemVariablesMutationResolver {

    /**
     * 数据中心 批量删除物品变量
     */
    Boolean batchDeleteDataCenterItemVariables(java.util.List<String> ids) throws Exception;

}