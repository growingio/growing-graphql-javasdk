package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 删除物品变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DeleteDataCenterItemVariableMutationResolver {

    /**
     * 数据中心 删除物品变量
     */
    @javax.validation.constraints.NotNull
    Boolean deleteDataCenterItemVariable(String id) throws Exception;

}