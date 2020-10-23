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
final public class DefaultCountDashboardsQueryResolver implements CountDashboardsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCountDashboardsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCountDashboardsQueryResolver() {}

    @Override
    public Integer countDashboards() throws Exception {
        CountDashboardsQueryRequest request = new CountDashboardsQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountDashboardsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountDashboardsQueryResponse.class);
        return result.countDashboards();
    }

}