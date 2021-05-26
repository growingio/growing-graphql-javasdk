package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 获取当前用户所在项目及项目角色
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CurrentUserProjectRoleTuplesQueryResolver {

    /**
     * 获取当前用户所在项目及项目角色
     */
    @javax.validation.constraints.NotNull
    java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples() throws Exception;

}