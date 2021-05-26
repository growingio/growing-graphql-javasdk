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
final public class $DeleteTencentPortraitMutationResolver implements DeleteTencentPortraitMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteTencentPortraitMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteTencentPortraitMutationResolver() {}

    @Override
    public Boolean deleteTencentPortrait(String projectId, String id) throws Exception {
        DeleteTencentPortraitMutationRequest request = new DeleteTencentPortraitMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteTencentPortraitMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteTencentPortraitMutationResponse.class);
        return result.deleteTencentPortrait();
    }

}