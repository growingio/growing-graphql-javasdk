package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 更批量删除用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface BatchDeleteDataCenterUserVariablesMutationResolver {

    /**
     * 数据中心 更批量删除用户属性
     */
    Boolean batchDeleteDataCenterUserVariables(java.util.List<String> ids) throws Exception;

}