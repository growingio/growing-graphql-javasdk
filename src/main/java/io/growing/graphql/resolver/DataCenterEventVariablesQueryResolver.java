package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心的事件变量列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface DataCenterEventVariablesQueryResolver {

    /**
     * 数据中心的事件变量列表
     */
    java.util.List<EventVariableDto> dataCenterEventVariables() throws Exception;

}