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
final public class $DataCenterInfoQueryResolver implements DataCenterInfoQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterInfoQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterInfoQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DataCenterInfoDto dataCenterInfo() throws Exception {
        DataCenterInfoQueryRequest request = new DataCenterInfoQueryRequest();
        DataCenterInfoResponseProjection projection = new DataCenterInfoResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterInfoQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterInfoQueryResponse.class);
        return result.dataCenterInfo();
    }

}