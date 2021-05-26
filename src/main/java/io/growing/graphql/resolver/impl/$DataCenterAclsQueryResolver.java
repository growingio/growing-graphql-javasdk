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
final public class $DataCenterAclsQueryResolver implements DataCenterAclsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterAclsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterAclsQueryResolver() {}

    @Override
    public java.util.List<UserAccessCtrlDto> dataCenterAcls(String resourceType) throws Exception {
        DataCenterAclsQueryRequest request = new DataCenterAclsQueryRequest();
        List<String> keys = Arrays.asList("resourceType");
        List<?> values = Arrays.asList(resourceType);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserAccessCtrlResponseProjection projection = new UserAccessCtrlResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterAclsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterAclsQueryResponse.class);
        return result.dataCenterAcls();
    }

}