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
final public class $AcceptAccountApplicationMutationResolver implements AcceptAccountApplicationMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $AcceptAccountApplicationMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AcceptAccountApplicationMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean acceptAccountApplication(String id, AccountApplicationInputDto input) throws Exception {
        AcceptAccountApplicationMutationRequest request = new AcceptAccountApplicationMutationRequest();
        List<String> keys = Arrays.asList("id", "input");
        List<?> values = Arrays.asList(id, input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        AcceptAccountApplicationMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AcceptAccountApplicationMutationResponse.class);
        return result.acceptAccountApplication();
    }

}