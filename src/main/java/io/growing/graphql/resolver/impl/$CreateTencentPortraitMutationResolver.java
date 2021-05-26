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
final public class $CreateTencentPortraitMutationResolver implements CreateTencentPortraitMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateTencentPortraitMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateTencentPortraitMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public TencentPortraitDto createTencentPortrait(String projectId, TencentPortraitInputDto tencentPortrait) throws Exception {
        CreateTencentPortraitMutationRequest request = new CreateTencentPortraitMutationRequest();
        List<String> keys = Arrays.asList("projectId", "tencentPortrait");
        List<?> values = Arrays.asList(projectId, tencentPortrait);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TencentPortraitResponseProjection projection = new TencentPortraitResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateTencentPortraitMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateTencentPortraitMutationResponse.class);
        return result.createTencentPortrait();
    }

}