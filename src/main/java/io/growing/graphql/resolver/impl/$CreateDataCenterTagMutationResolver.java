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
final public class $CreateDataCenterTagMutationResolver implements CreateDataCenterTagMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterTagMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterTagMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public TagDto createDataCenterTag(TagInputDto tag) throws Exception {
        CreateDataCenterTagMutationRequest request = new CreateDataCenterTagMutationRequest();
        List<String> keys = Arrays.asList("tag");
        List<?> values = Arrays.asList(tag);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TagResponseProjection projection = new TagResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterTagMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterTagMutationResponse.class);
        return result.createDataCenterTag();
    }

}