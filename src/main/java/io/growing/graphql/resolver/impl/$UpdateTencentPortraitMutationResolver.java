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
final public class $UpdateTencentPortraitMutationResolver implements UpdateTencentPortraitMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateTencentPortraitMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateTencentPortraitMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public TencentPortraitDto updateTencentPortrait(String projectId, String id, TencentPortraitInputDto tencentPortrait) throws Exception {
        UpdateTencentPortraitMutationRequest request = new UpdateTencentPortraitMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id", "tencentPortrait");
        List<?> values = Arrays.asList(projectId, id, tencentPortrait);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TencentPortraitResponseProjection projection = new TencentPortraitResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateTencentPortraitMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateTencentPortraitMutationResponse.class);
        return result.updateTencentPortrait();
    }

}