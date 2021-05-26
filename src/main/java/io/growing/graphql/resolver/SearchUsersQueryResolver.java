package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 查询用户，properties为返回哪些用户信息/属性，filter为需要的过滤字段，之前的q现在使用filter传
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface SearchUsersQueryResolver {

    /**
     * 查询用户，properties为返回哪些用户信息/属性，filter为需要的过滤字段，之前的q现在使用filter传
     */
    java.util.List<UserSearchDto> searchUsers(String projectId, java.util.List<String> properties, FilterInputDto filter) throws Exception;

}