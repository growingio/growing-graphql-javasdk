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
final public class $AccountApplicationsQueryResolver implements AccountApplicationsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $AccountApplicationsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AccountApplicationsQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<AccountApplicationDto> accountApplications() throws Exception {
        AccountApplicationsQueryRequest request = new AccountApplicationsQueryRequest();
        AccountApplicationResponseProjection projection = new AccountApplicationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        AccountApplicationsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AccountApplicationsQueryResponse.class);
        return result.accountApplications();
    }

}