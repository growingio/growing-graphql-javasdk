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
final public class $CountTunnelsQueryResolver implements CountTunnelsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CountTunnelsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CountTunnelsQueryResolver() {}

    @Override
    public Integer countTunnels() throws Exception {
        CountTunnelsQueryRequest request = new CountTunnelsQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountTunnelsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountTunnelsQueryResponse.class);
        return result.countTunnels();
    }

}