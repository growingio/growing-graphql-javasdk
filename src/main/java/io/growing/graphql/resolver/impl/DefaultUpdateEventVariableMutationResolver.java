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
final public class DefaultUpdateEventVariableMutationResolver implements UpdateEventVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateEventVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateEventVariableMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public EventVariableDto updateEventVariable(String id, VariableInputDto eventVariable) throws Exception {
        UpdateEventVariableMutationRequest request = new UpdateEventVariableMutationRequest();
        List<String> keys = Arrays.asList("id", "eventVariable");
        List<?> values = Arrays.asList(id, eventVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        EventVariableResponseProjection projection = new EventVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateEventVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateEventVariableMutationResponse.class);
        return result.updateEventVariable();
    }

}