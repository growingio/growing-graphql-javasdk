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
final public class $ResetPasswordMutationResolver implements ResetPasswordMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $ResetPasswordMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $ResetPasswordMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean resetPassword(ResetPasswordInputDto input) throws Exception {
        ResetPasswordMutationRequest request = new ResetPasswordMutationRequest();
        List<String> keys = Arrays.asList("input");
        List<?> values = Arrays.asList(input);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        ResetPasswordMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ResetPasswordMutationResponse.class);
        return result.resetPassword();
    }

}