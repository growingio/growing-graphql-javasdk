package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 事件变量列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface EventVariablesQueryResolver {

    /**
     * 事件变量列表
     */
    java.util.List<EventVariableDto> eventVariables(String projectId) throws Exception;

}