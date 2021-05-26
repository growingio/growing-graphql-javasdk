package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 数据中心 删除用户属性
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DeleteDataCenterUserVariableMutationResolver {

    /**
     * 数据中心 删除用户属性
     */
    @javax.validation.constraints.NotNull
    Boolean deleteDataCenterUserVariable(String id) throws Exception;

}