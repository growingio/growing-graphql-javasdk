package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 通过 id 获取数据中心的事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterEventVariableQueryResolver {

    /**
     * 通过 id 获取数据中心的事件变量
     */
    EventVariableDto dataCenterEventVariable(String id) throws Exception;

}