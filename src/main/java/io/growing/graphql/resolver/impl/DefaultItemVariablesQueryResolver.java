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
final public class DefaultItemVariablesQueryResolver implements ItemVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultItemVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultItemVariablesQueryResolver() {}

    @Override
    public java.util.List<ItemVariableDto> itemVariables() throws Exception {
        ItemVariablesQueryRequest request = new ItemVariablesQueryRequest();
        ItemVariableResponseProjection projection = new ItemVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        ItemVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, ItemVariablesQueryResponse.class);
        return result.itemVariables();
    }

}