package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 更新事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateDataCenterEventVariableMutationResolver {

    /**
     * 数据中心 更新事件变量
     */
    @javax.validation.constraints.NotNull
    EventVariableDto updateDataCenterEventVariable(String id, VariableInputDto eventVariable) throws Exception;

}