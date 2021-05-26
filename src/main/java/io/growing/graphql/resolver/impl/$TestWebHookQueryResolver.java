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

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $TestWebHookQueryResolver implements TestWebHookQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $TestWebHookQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TestWebHookQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public WebHookResponseDto testWebHook(WebHookInputDto input) throws Exception {
        TestWebHookQueryRequest request = new TestWebHookQueryRequest();
        List<String> keys = Arrays.asList("input");
        List<?> values = Arrays.asList(input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        WebHookResponseResponseProjection projection = new WebHookResponseResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        TestWebHookQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TestWebHookQueryResponse.class);
        return result.testWebHook();
    }

}