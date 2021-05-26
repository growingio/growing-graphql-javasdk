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

/**
 * 数据中心的 用户ID - 所有属性均为预置的用户标识符
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterUserIdentitiesQueryResolver implements DataCenterUserIdentitiesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterUserIdentitiesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterUserIdentitiesQueryResolver() {}

    /**
     * 数据中心的 用户ID - 所有属性均为预置的用户标识符
     */
    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<UserIdentityDto> dataCenterUserIdentities() throws Exception {
        DataCenterUserIdentitiesQueryRequest request = new DataCenterUserIdentitiesQueryRequest();
        UserIdentityResponseProjection projection = new UserIdentityResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterUserIdentitiesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterUserIdentitiesQueryResponse.class);
        return result.dataCenterUserIdentities();
    }

}