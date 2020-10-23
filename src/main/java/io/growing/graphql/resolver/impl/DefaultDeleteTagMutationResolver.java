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
final public class DefaultDeleteTagMutationResolver implements DeleteTagMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultDeleteTagMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultDeleteTagMutationResolver() {}

    @Override
    public Boolean deleteTag(String id) throws Exception {
        DeleteTagMutationRequest request = new DeleteTagMutationRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteTagMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteTagMutationResponse.class);
        return result.deleteTag();
    }

}