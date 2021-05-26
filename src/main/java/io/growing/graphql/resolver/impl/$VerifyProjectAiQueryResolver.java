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
final public class $VerifyProjectAiQueryResolver implements VerifyProjectAiQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $VerifyProjectAiQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $VerifyProjectAiQueryResolver() {}

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