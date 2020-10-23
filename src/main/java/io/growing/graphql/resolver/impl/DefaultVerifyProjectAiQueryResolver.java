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
 * 检验SDK安装匹配
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultVerifyProjectAiQueryResolver implements VerifyProjectAiQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultVerifyProjectAiQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultVerifyProjectAiQueryResolver() {}

    /**
     * 检验SDK安装匹配
     */
    @javax.validation.constraints.NotNull
    @Override
    public Boolean verifyProjectAi(String ai) throws Exception {
        VerifyProjectAiQueryRequest request = new VerifyProjectAiQueryRequest();
        List<String> keys = Arrays.asList("ai");
        List<?> values = Arrays.asList(ai);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        VerifyProjectAiQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, VerifyProjectAiQueryResponse.class);
        return result.verifyProjectAi();
    }

}