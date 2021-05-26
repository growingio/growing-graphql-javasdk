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
final public class $MembersQueryResolver implements MembersQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $MembersQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $MembersQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public SlicePaginationDto members(String scopeId, MemberScopeTypeInputDto scopeType, Integer offset, Integer limit) throws Exception {
        MembersQueryRequest request = new MembersQueryRequest();
        List<String> keys = Arrays.asList("scopeId", "scopeType", "offset", "limit");
        List<?> values = Arrays.asList(scopeId, scopeType, offset, limit);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        SlicePaginationResponseProjection projection = new SlicePaginationResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        MembersQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, MembersQueryResponse.class);
        return result.members();
    }

}