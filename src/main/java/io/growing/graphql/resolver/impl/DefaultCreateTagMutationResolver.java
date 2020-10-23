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
final public class DefaultCreateTagMutationResolver implements CreateTagMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateTagMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateTagMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public TagDto createTag(TagInputDto tag) throws Exception {
        CreateTagMutationRequest request = new CreateTagMutationRequest();
        List<String> keys = Arrays.asList("tag");
        List<?> values = Arrays.asList(tag);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TagResponseProjection projection = new TagResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateTagMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateTagMutationResponse.class);
        return result.createTag();
    }

}