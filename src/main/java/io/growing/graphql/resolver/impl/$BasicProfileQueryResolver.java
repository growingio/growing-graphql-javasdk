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
final public class $BasicProfileQueryResolver implements BasicProfileQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $BasicProfileQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BasicProfileQueryResolver() {}

    @Override
    public BasicProfileDto basicProfile(String projectId, String id) throws Exception {
        BasicProfileQueryRequest request = new BasicProfileQueryRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        BasicProfileResponseProjection projection = new BasicProfileResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        BasicProfileQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BasicProfileQueryResponse.class);
        return result.basicProfile();
    }

}