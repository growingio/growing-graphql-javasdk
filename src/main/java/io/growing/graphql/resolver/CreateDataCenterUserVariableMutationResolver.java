package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 创建用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateDataCenterUserVariableMutationResolver {

    /**
     * 数据中心 创建用户属性
     */
    @javax.validation.constraints.NotNull
    UserVariableDto createDataCenterUserVariable(VariableInputDto userVariable) throws Exception;

}