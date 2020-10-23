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
final public class DefaultCountUserVariablesQueryResolver implements CountUserVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCountUserVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCountUserVariablesQueryResolver() {}

    @Override
    public Integer countUserVariables() throws Exception {
        CountUserVariablesQueryRequest request = new CountUserVariablesQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountUserVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountUserVariablesQueryResponse.class);
        return result.countUserVariables();
    }

}