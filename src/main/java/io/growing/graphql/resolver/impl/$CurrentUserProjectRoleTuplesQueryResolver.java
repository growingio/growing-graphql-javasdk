package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

/**
 * 获取当前用户所在项目及项目角色
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CurrentUserProjectRoleTuplesQueryResolver implements CurrentUserProjectRoleTuplesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CurrentUserProjectRoleTuplesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CurrentUserProjectRoleTuplesQueryResolver() {}

    /**
     * 获取当前用户所在项目及项目角色
     */
    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples() throws Exception {
        CurrentUserProjectRoleTuplesQueryRequest request = new CurrentUserProjectRoleTuplesQueryRequest();
        UserProjectRoleTupleResponseProjection projection = new UserProjectRoleTupleResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CurrentUserProjectRoleTuplesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CurrentUserProjectRoleTuplesQueryResponse.class);
        return result.currentUserProjectRoleTuples();
    }

}