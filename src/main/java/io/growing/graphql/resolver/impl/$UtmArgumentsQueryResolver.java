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
    date = "2021-05-26T15:01:23+0800"
)
final public class $UtmArgumentsQueryResolver implements UtmArgumentsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UtmArgumentsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UtmArgumentsQueryResolver() {}

    @Override
    public java.util.List<UtmArgumentDto> utmArguments() throws Exception {
        UtmArgumentsQueryRequest request = new UtmArgumentsQueryRequest();
        UtmArgumentResponseProjection projection = new UtmArgumentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UtmArgumentsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UtmArgumentsQueryResponse.class);
        return result.utmArguments();
    }

}