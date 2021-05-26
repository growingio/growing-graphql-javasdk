package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 获取当前用户所在项目及项目角色
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CurrentUserProjectRoleTuplesQueryResponse extends GraphQLResult<Map<String, java.util.List<UserProjectRoleTupleDto>>> {

    private static final String OPERATION_NAME = "currentUserProjectRoleTuples";

    public CurrentUserProjectRoleTuplesQueryResponse() {
    }

    /**
     * 获取当前用户所在项目及项目角色
     */
    public java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples() {
        Map<String, java.util.List<UserProjectRoleTupleDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
