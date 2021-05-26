package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 更新物品变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateDataCenterItemVariableMutationResolver {

    /**
     * 数据中心 更新物品变量
     */
    @javax.validation.constraints.NotNull
    ItemVariableDto updateDataCenterItemVariable(String id, VariableInputDto itemVariable) throws Exception;

}