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
    date = "2020-12-22T15:45:58+0800"
)
final public class $ResetAccountPasswordMutationResolver implements ResetAccountPasswordMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $ResetAccountPasswordMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ResetAccountPasswordMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public String resetAccountPassword(String id) throws Exception {
        ResetAccountPasswordMutationRequest request = new ResetAccountPasswordMutationRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        ResetAccountPasswordMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ResetAccountPasswordMutationResponse.class);
        return result.resetAccountPassword();
    }

}