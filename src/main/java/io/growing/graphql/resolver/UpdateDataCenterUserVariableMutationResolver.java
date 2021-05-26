package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 更新用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface UpdateDataCenterUserVariableMutationResolver {

    /**
     * 数据中心 更新用户属性
     */
    @javax.validation.constraints.NotNull
    UserVariableDto updateDataCenterUserVariable(String id, VariableInputDto userVariable) throws Exception;

}