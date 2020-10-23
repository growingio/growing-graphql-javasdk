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
final public class DefaultAclsQueryResolver implements AclsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultAclsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultAclsQueryResolver() {}

    @Override
    public java.util.List<UserAccessCtrlDto> acls(String resourceType) throws Exception {
        AclsQueryRequest request = new AclsQueryRequest();
        List<String> keys = Arrays.asList("resourceType");
        List<?> values = Arrays.asList(resourceType);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserAccessCtrlResponseProjection projection = new UserAccessCtrlResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        AclsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AclsQueryResponse.class);
        return result.acls();
    }

}