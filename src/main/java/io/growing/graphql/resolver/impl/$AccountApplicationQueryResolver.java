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
final public class $AccountApplicationQueryResolver implements AccountApplicationQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $AccountApplicationQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AccountApplicationQueryResolver() {}

    @Override
    public AccountApplicationDto accountApplication(String id) throws Exception {
        AccountApplicationQueryRequest request = new AccountApplicationQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AccountApplicationResponseProjection projection = new AccountApplicationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        AccountApplicationQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AccountApplicationQueryResponse.class);
        return result.accountApplication();
    }

}