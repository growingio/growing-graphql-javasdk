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
final public class $PasswordValidationQueryResolver implements PasswordValidationQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $PasswordValidationQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $PasswordValidationQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean passwordValidation(String identity, String password) throws Exception {
        PasswordValidationQueryRequest request = new PasswordValidationQueryRequest();
        List<String> keys = Arrays.asList("identity", "password");
        List<?> values = Arrays.asList(identity, password);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        PasswordValidationQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PasswordValidationQueryResponse.class);
        return result.passwordValidation();
    }

}