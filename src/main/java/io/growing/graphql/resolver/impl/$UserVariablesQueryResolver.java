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
 * 用户变量列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UserVariablesQueryResolver implements UserVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserVariablesQueryResolver() {}

    /**
     * 用户变量列表
     */
    @Override
    public java.util.List<UserVariableDto> userVariables(String projectId) throws Exception {
        UserVariablesQueryRequest request = new UserVariablesQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserVariableResponseProjection projection = new UserVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserVariablesQueryResponse.class);
        return result.userVariables();
    }

}