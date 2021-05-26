package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 物品模型添加属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterAddItemModelAttributeMutationResolver {

    /**
     * 数据中心 物品模型添加属性
     */
    ItemVariableDto dataCenterAddItemModelAttribute(String id, ItemVariableInputDto attribute) throws Exception;

}