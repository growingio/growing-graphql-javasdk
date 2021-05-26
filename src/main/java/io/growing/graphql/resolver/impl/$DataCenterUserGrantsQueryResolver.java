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
final public class $DataCenterUserGrantsQueryResolver implements DataCenterUserGrantsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterUserGrantsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterUserGrantsQueryResolver() {}

    @Override
    public AccessEntryDto dataCenterUserGrants(String resourceType, java.lang.Long resourceId) throws Exception {
        DataCenterUserGrantsQueryRequest request = new DataCenterUserGrantsQueryRequest();
        List<String> keys = Arrays.asList("resourceType", "resourceId");
        List<?> values = Arrays.asList(resourceType, resourceId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        AccessEntryResponseProjection projection = new AccessEntryResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterUserGrantsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterUserGrantsQueryResponse.class);
        return result.dataCenterUserGrants();
    }

}