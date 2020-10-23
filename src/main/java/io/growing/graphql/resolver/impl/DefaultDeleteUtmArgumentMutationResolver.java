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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultDeleteUtmArgumentMutationResolver implements DeleteUtmArgumentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultDeleteUtmArgumentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultDeleteUtmArgumentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean deleteUtmArgument(String id) throws Exception {
        DeleteUtmArgumentMutationRequest request = new DeleteUtmArgumentMutationRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteUtmArgumentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteUtmArgumentMutationResponse.class);
        return result.deleteUtmArgument();
    }

}