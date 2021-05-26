package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心物品模型列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterItemModelsQueryResolver {

    /**
     * 数据中心物品模型列表
     */
    java.util.List<ItemModelDto> dataCenterItemModels() throws Exception;

}