package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 查询用户，properties为返回哪些用户信息/属性，filter为需要的过滤字段，之前的q现在使用filter传
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SearchUsersQueryResponse extends GraphQLResult<Map<String, java.util.List<UserSearchDto>>> {

    private static final String OPERATION_NAME = "searchUsers";

    public SearchUsersQueryResponse() {
    }

    /**
     * 查询用户，properties为返回哪些用户信息/属性，filter为需要的过滤字段，之前的q现在使用filter传
     */
    public java.util.List<UserSearchDto> searchUsers() {
        Map<String, java.util.List<UserSearchDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
